#!/usr/bin/env bash
# Refreshes the bundled OpenAPI snapshot used for Java codegen (requires curl + jq + network).
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
OUT="$ROOT/src/main/resources/openapi/openapi-sanitized.json"
mkdir -p "$(dirname "$OUT")"
"$ROOT/scripts/sanitize-openapi-for-sdk.sh" "$OUT"
echo "Updated: $OUT"
jq -r '"paths: " + (.paths | keys | length | tostring) + " | openapi: " + .openapi' "$OUT"
