import WebRobot.Cli.Sdk.Utils.Sha512Crypt;
import WebRobot.Cli.Sdk.model.*;
import com.amazonaws.opensdk.SdkRequestConfig;
import com.google.common.hash.Hashing;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class ProjectTests extends  TestBase
{
    @Test
    public void testHash()
    {
        String apiSecret = "e1rKfY9Ov$c3*ScZ6f!*ZB!8ehU&JnaiDR$9Tmq8";
        String hashApiSecret = Sha512Crypt.Sha512_crypt(apiSecret,"salt",656000).toString();
        String apiKey =  "umGWhmzvGz50oRVFIxLkn3VOmWoZMOmU3CdYgH5s";
        String username_password = apiKey + ":" + hashApiSecret;
        String encodedString = Base64.getEncoder().encodeToString(username_password.getBytes());
        assertNotEquals(encodedString,1,1);
    }

    @Test
    public void testDeleteScript()
    {
        Delete_scriptRequest delete_scriptRequest = new Delete_scriptRequest();
        delete_scriptRequest.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        delete_scriptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        delete_scriptRequest.setScriptId("4f154987-63b4-4c27-b66f-bb7c77953a92");
        Delete_scriptResult deleteScriptResult  = sdkClient.delete_script(delete_scriptRequest);

        Get_scriptsRequest getScripts = new Get_scriptsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        getScripts.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        getScripts.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");

        Get_scriptsResult scriptListResult  = sdkClient.get_scripts(getScripts);
        assertEquals("scripts list problem",scriptListResult.getListScripts().getScripts().size(),0);
    }

    @Test
    public void testUpdateScript()
    {
        Update_scriptRequest update_scriptRequest = new Update_scriptRequest();

        update_scriptRequest.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        update_scriptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");

        GetScriptRequest get_scriptRequest = new GetScriptRequest();
        get_scriptRequest.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        get_scriptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        get_scriptRequest.setScriptId("4f154987-63b4-4c27-b66f-bb7c77953a92");

        GetScriptResult getScriptResult  = sdkClient.getscript(get_scriptRequest);
        BotScript botScript = getScriptResult.getBotScript();
        botScript.setCode("alert('hello world changed')");
        update_scriptRequest.setBotScript(botScript);
        update_scriptRequest.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        update_scriptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        update_scriptRequest.setScriptId("4f154987-63b4-4c27-b66f-bb7c77953a92");
        Update_scriptResult updateScriptResult  = sdkClient.update_script(update_scriptRequest);
        assertEquals("bot script code", updateScriptResult.getBotScript().getCode(),"alert('hello world changed')");

    }

    @Test
    public void testAddScript()
    {
        Add_scriptRequest add_scriptRequest  = new Add_scriptRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        add_scriptRequest.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        add_scriptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        BotScript botScript = new BotScript();
        botScript.setCode("alert('hello worlds')");
        add_scriptRequest.setBotScript(botScript);
        Add_scriptResult add_scriptResult  = sdkClient.add_script(add_scriptRequest);

        Get_scriptsRequest getScripts = new Get_scriptsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        getScripts.setProjectId("79e3beb1-8603-4ef0-b6a6-51818899a5fd");
        getScripts.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");

        Get_scriptsResult scriptListResult  = sdkClient.get_scripts(getScripts);
        assertEquals("scripts list problem",scriptListResult.getListScripts().getScripts().size(),1);

    }

    @Test
    public void testDeleteBot()
    {
        Delete_botRequest deleteBotRequest  = new Delete_botRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        deleteBotRequest.setProjectId("1");
        deleteBotRequest.setBotId("e9ab26a1-17a7-4586-a98c-f2aa9e20339b");
        Delete_botResult deleteBotResult  = sdkClient.delete_bot(deleteBotRequest);
        Get_all_botsRequest botListRequests  = new Get_all_botsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        Get_all_botsResult botListResults  = sdkClient.get_all_bots(botListRequests);
        assertEquals("project list problem",botListResults.getListBots().getBots().size(),0);

    }

    @Test
    public void testDeleteProject()
    {
        Delete_projectRequest delete_projectRequest  = new Delete_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        delete_projectRequest.setProjectId("c6921742-5c65-4681-9f19-c71cd604ef37");
        Delete_projectResult delete_projectResult  = sdkClient.delete_project(delete_projectRequest);
        Get_all_projectsRequest projectListRequest  = new Get_all_projectsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        Get_all_projectsResult projectListResult  = sdkClient.get_all_projects(projectListRequest);
        assertEquals("project delete problem",projectListResult.getListProjects().getProjects().size(),0);


    }

    @Test
    public void testGetAllProjets()
    {
        Get_all_projectsRequest projectListRequest  = new Get_all_projectsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        Get_all_projectsResult projectListResult  = sdkClient.get_all_projects(projectListRequest);
        assertEquals("project list problem",projectListResult.getListProjects().getProjects().size(),1);
    }


    @Test
    public void testGetProject()
    {
        Get_projectRequest projectRequest  = new Get_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        projectRequest.setProjectId("c6921742-5c65-4681-9f19-c71cd604ef37");
        Get_projectResult projectResult  = sdkClient.get_project(projectRequest);
        assertEquals("project list problem",projectResult.getProject().getId(),"c6921742-5c65-4681-9f19-c71cd604ef37");
    }

    @Test
    public void testGetBotFromName()
    {
        GetBotFromNameRequest   botRequest  = new GetBotFromNameRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        botRequest.setProjectId("ae0d26cd-e180-4d9c-bb85-a7fc7182badc");
        botRequest.setBotName("testBot");
        GetBotFromNameResult botResult  = sdkClient.getbotfromname(botRequest);
        assertEquals("bot get bot problem",botResult.getBot().getId(),"7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
    }

    @Test
    public void testGetBot()
    {
        GetBotFromIdRequest   botRequest  = new GetBotFromIdRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        botRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        botRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        GetBotFromIdResult botResult  = sdkClient.getbotfromid(botRequest);
        assertEquals("bot get bot problem",botResult.getBot().getId(),"7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
    }


    @Test
    public void testUpdateProject()
    {
        Get_projectRequest   projectRequest  = new Get_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        projectRequest.setProjectId("44c3bd5a-f37e-4f28-9070-78146472d4a6");
        Get_projectResult projectResult  = sdkClient.get_project(projectRequest);
        Project project = projectResult.getProject();
        Update_projectRequest updateProjectRequest  = new Update_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        updateProjectRequest.setProjectId("44c3bd5a-f37e-4f28-9070-78146472d4a6");
        project.setDescription("test project description update");
        updateProjectRequest.setProject(project);
        Update_projectResult update_projectResult  = sdkClient.update_project(updateProjectRequest);
        assertEquals("update bot problem",update_projectResult.getProject().getDescription(),"test project description update");
    }


    @Test
    public void testUpdateBot()
    {
        GetBotFromIdRequest   botRequest  = new GetBotFromIdRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        botRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        botRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        GetBotFromIdResult botResult  = sdkClient.getbotfromid(botRequest);
        Update_botRequest updateBotRequest  = new Update_botRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        updateBotRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        updateBotRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        Bot bot = botResult.getBot();
        bot.setDescription("bot changed");
        updateBotRequest.setBot(bot);
        Update_botResult update_botResult  = sdkClient.update_bot(updateBotRequest);
        assertEquals("update bot problem",update_botResult.getBot().getDescription(),"bot changed");
    }


    @Test
    public void testGetAllBots()
    {
        Get_all_botsRequest allBotsRequests  = new Get_all_botsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        allBotsRequests.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        Get_all_botsResult allBotsResults  = sdkClient.get_all_bots(allBotsRequests);
        assertEquals("bot list problems",allBotsResults.getListBots().getBots().size(),1);
    }

    @Test
    public void testAddProject() {
        Create_projectRequest createProject = new Create_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        Project project = new Project();
        project.setName("project test");
        project.setDescription("project description");
        createProject.setProject(project);
        sdkClient.create_project(createProject);
    }
    @Test
    public void testAddBot()
    {
        try {
            Create_botRequest createBot = new Create_botRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
            createBot.setProjectId("test");
            Bot bot = new Bot();
            bot.setName("testBot");
            bot.setDescription("test bot");
            bot.setCode(" FETCH WHERE ACTIONS ARE (\n" +
                    "                    (\n" +
                    "                    action = VISIT WITH ARGS(url = (('https://www.paginegialle.it/')))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = TEXTINPUT WITH ARGS( selector = (('input[id=\"cosa\"]')) AND value = (('farmacie')))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = CLICK WITH ARGS ( selector = (('span[class=\"icon icon--close_narrow icon--18\"]')))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = RANDOMDELAY WITH ARGS(min = (('1')) AND max = (('2')))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = TEXTINPUT WITH ARGS( selector = (('input[id=\"dove\"]')) AND value = (('') + $(dove)))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = CLICK WITH ARGS( selector = (('button[id=\"searchSubmit\"]')))\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    action = RANDOMDELAY WITH ARGS(min = (('2')) AND max = (('3')))\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    THEN EXPLORE\n" +
                    "                    (\n" +
                    "                    ( PIVOTED(('a')).attr((('data-pageurl')))) AS page_url\n" +
                    "                    )\n" +
                    "                    WHERE\n" +
                    "                    (\n" +
                    "                    splitter = CURRENT(('div[class=\"my-24  text-center nextPageButton\"]'))\n" +
                    "                    AND ACTIONS ARE\n" +
                    "                    (\n" +
                    "                    (\n" +
                    "                    action = VISIT WITH ARGS(\n" +
                    "                    url = interop(('https://www.paginegialle.it') + $( PIVOTED(('a')).attr((('data-pageurl')))))\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    THEN WGETJOIN WHERE (\n" +
                    "                    splitter = CURRENT(('div[class=\"search-listing\"] section h2 a'))\n" +
                    "                    )\n" +
                    "                    THEN SELECT (\n" +
                    "                    (\n" +
                    "                    CURRENT(('h1')).text AS title\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"company__address\"]')).text AS company_address\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"phone-numbers\"] [id^=\"mainPhoneNumber_desk\"] div:nth-child(2')).text AS phone_number\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"phone-numbers\"] [id^=\"otherPhoneNumbers_desk\"] div:nth-child(2')).text AS other_phone_number\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"read-more__content-inner\"]')).text AS description\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card card--rounded\"] div[class=\"my-22\"]:nth-child(1)')).text AS piva\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card card--rounded\"] div[class=\"my-22\"]:nth-child(2)')).text AS legal_info\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card card--rounded\"] div[class=\"my-22\"]:nth-child(3)')).text AS altri_marchi\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card__body ln-4\"] div[class=\"my-18\"]:nth-child(1)')).text AS activities\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card__body ln-4\"] div[class=\"my-18\"]:nth-child(2)')).text AS analisi\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card__body ln-4\"] div[class=\"my-18\"]:nth-child(3)')).text AS products\n" +
                    "                    )\n" +
                    "                    THEN\n" +
                    "                    (\n" +
                    "                    CURRENT(('div[class=\"card__body ln-4\"] div[class=\"my-18\"]:nth-child(4)')).text AS services\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    THEN WGETJOIN WHERE (\n" +
                    "                    splitter = CURRENT(('a[data-pag=\"www\"],a[data-pag=\"Sito Personalizzato]'))\n" +
                    "                    )\n" +
                    "                    AND PARAMETERS ARE\n" +
                    "                    (\n" +
                    "                    flattenJoinType = (('LeftOuter'))\n" +
                    "                    )\n" +
                    "                    THEN SELECT (\n" +
                    "                    (\n" +
                    "                    CURRENT(('body')).allemail AS m_target\n" +
                    "                    )\n" +
                    "                    )\n" +
                    "                    THEN WGETEXPLORE WHERE (\n" +
                    "                    splitter = CURRENT(('body')).findallinternal((('a[href*=\"contatti\"]')))\n" +
                    "                    )\n" +
                    "                    AND PARAMETERS ARE\n" +
                    "                    (\n" +
                    "                    maxDepth = (('1'))\n" +
                    "                    )\n" +
                    "                    THEN SELECT (\n" +
                    "                    (\n" +
                    "                    CURRENT(('body')).allemail AS m1_target\n" +
                    "                    )\n" +
                    "                    )");

            createBot.setBot(bot);
            Create_botResult projectResult = sdkClient.create_bot(createBot);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
