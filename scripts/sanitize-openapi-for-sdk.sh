#!/usr/bin/env bash
# Fetches production OpenAPI and drops paths that break OpenAPI Generator (invalid path params / multipart edge cases).
set -euo pipefail
OUT="${1:?usage: sanitize-openapi-for-sdk.sh <output.json>}"
mkdir -p "$(dirname "$OUT")"
curl -fsS "https://api.webrobot.eu/api/openapi.json" | jq '
  .info = (.info // {title: "WebRobot API", version: "1.0.0"})
  | .paths |= with_entries(select((.key | test("^/webrobot/api/datasets-legacy")) | not))
' > "$OUT"
