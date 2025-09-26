import WebRobot.Cli.Sdk.model.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class ConceptsTest  extends  TestBase
{
    @Test
    public void testDeletePage()
    {
        Delete_page_from_idRequest delete_page_from_idRequest = new Delete_page_from_idRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        delete_page_from_idRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        delete_page_from_idRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        delete_page_from_idRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        delete_page_from_idRequest.setPageId("bde13986-35f2-4c96-b270-21cd02075891");
        Delete_page_from_idResult deletePageResult = this.sdkClient.delete_page_from_id(delete_page_from_idRequest);

    }

    @Test
    public void testUpdatePage()
    {
        Get_page_from_idRequest get_page_from_idRequest = new Get_page_from_idRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        get_page_from_idRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        get_page_from_idRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        get_page_from_idRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        get_page_from_idRequest.setPageId("bde13986-35f2-4c96-b270-21cd02075891");
        Get_page_from_idResult get_pageIdResult = this.sdkClient.get_page_from_id(get_page_from_idRequest);

        Page page = get_pageIdResult.getPage();
        Update_pageRequest update_pageRequest = new Update_pageRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        update_pageRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        update_pageRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        update_pageRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        update_pageRequest.setPageId("bde13986-35f2-4c96-b270-21cd02075891");

        page.setUrl("testUrl");
        page.setHtml("<html>changed</html>");
        update_pageRequest.setPage(page);
        Update_pageResult pageResult = this.sdkClient.update_page(update_pageRequest);
    }

    @Test
    public void testCreatePage()
    {
        Create_pageRequest create_pageRequest = new Create_pageRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        create_pageRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        create_pageRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        create_pageRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        Page page = new Page();
        page.setUrl("test");
        page.setHtml("<html></html>");
        List<PageAttribute> attributes = new ArrayList<PageAttribute>();
        PageAttribute pageAttribute = new PageAttribute();
        pageAttribute.setName("Test");
        pageAttribute.setValue("Test");
        attributes.add(pageAttribute);
        page.setAttributes(attributes);
        create_pageRequest.setPage(page);
        Create_pageResult pageResult = this.sdkClient.create_page(create_pageRequest);
    }

    @Test
    public void testDeleteAttribute()
    {
        Delete_attributeRequest deleteRequest = new Delete_attributeRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        deleteRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        deleteRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        deleteRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        deleteRequest.setAttributeId("220ac270-22b4-40b4-87a7-a691748299bd");
        Delete_attributeResult deleteAttribute = this.sdkClient.delete_attribute(deleteRequest);

    }

    @Test
    public void testDeleteConcept()
    {
        Delete_conceptRequest deleteConceptRequest = new Delete_conceptRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        deleteConceptRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        deleteConceptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        deleteConceptRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        Delete_conceptResult deleteResult =  this.sdkClient.delete_concept(deleteConceptRequest);

    }



    @Test
    public void testUpdateAttribute()
    {


        Get_attribute_from_idRequest attributeFromIdRequest = new Get_attribute_from_idRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        attributeFromIdRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        attributeFromIdRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        attributeFromIdRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        attributeFromIdRequest.setAttributeId("220ac270-22b4-40b4-87a7-a691748299bd");
        Get_attribute_from_idResult attribute_from_idResult = this.sdkClient.get_attribute_from_id(attributeFromIdRequest);


        ConceptAttribute attribute = attribute_from_idResult.getConceptAttribute();
        attribute.setName("Test");

        Update_attributeRequest updateAttributeRequest = new Update_attributeRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;;
        updateAttributeRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        updateAttributeRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        updateAttributeRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        updateAttributeRequest.setAttributeId("220ac270-22b4-40b4-87a7-a691748299bd");
        updateAttributeRequest.setConceptAttribute(attribute);
        this.sdkClient.update_attribute(updateAttributeRequest);


        attributeFromIdRequest = new Get_attribute_from_idRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;;
        attributeFromIdRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        attributeFromIdRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        attributeFromIdRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        attributeFromIdRequest.setAttributeId("220ac270-22b4-40b4-87a7-a691748299bd");
        attribute_from_idResult = this.sdkClient.get_attribute_from_id(attributeFromIdRequest);
        assertEquals("bug with update attribute",attribute_from_idResult.getConceptAttribute().getName(),"Test");

        Get_attribute_from_nameRequest get_attribute_from_nameRequest = new Get_attribute_from_nameRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        get_attribute_from_nameRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        get_attribute_from_nameRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        get_attribute_from_nameRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        get_attribute_from_nameRequest.setAttributeName("Test");

        Get_attribute_from_nameResult result =  this.sdkClient.get_attribute_from_name(get_attribute_from_nameRequest);
        assertEquals("bug with get attribute from name" ,result.getConceptAttribute().getName(),"Test");

    }

    @Test
    public void testAddAttributeRequest()
    {
        Add_attributesRequest addAttributeRequest = new Add_attributesRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        addAttributeRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        addAttributeRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        addAttributeRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        ConceptAttribute conceptAttribute = new ConceptAttribute();
        conceptAttribute.setName("Field1");
        conceptAttribute.setLabel("Field1");
        conceptAttribute.setTypeAttribute("GoldText");
        addAttributeRequest.setConceptAttribute(conceptAttribute);
        Add_attributesResult attributeResult = this.sdkClient.add_attributes(addAttributeRequest);
        Get_all_attributesRequest get_all_attributesRequest = new Get_all_attributesRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        get_all_attributesRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        get_all_attributesRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        get_all_attributesRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        get_all_attributesRequest.setTypeAttribute("GoldText");
        Get_all_attributesResult getAttributesResult =  this.sdkClient.get_all_attributes(get_all_attributesRequest);
        assertEquals("bug with add attribute",getAttributesResult.getListAttributes().getAttributes().size(),1);

    }

   @Test
   public void testGetConceptFromName()
   {
       Get_concept_from_nameRequest conceptFromName = new Get_concept_from_nameRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
       conceptFromName.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
       conceptFromName.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
       conceptFromName.setConceptName("TestConcept");
       conceptFromName.setTypeAttribute("GoldText");
       Get_concept_from_nameResult get_concept_from_nameResult =  this.sdkClient.get_concept_from_name(conceptFromName);
       assertEquals("bug with getConceptFromName", get_concept_from_nameResult.getConcept().getId(),"d45e5143-b329-45b8-812f-8c01372cb47b");
   }

    @Test
    public void testUpdateConcept()
    {
        Get_concept_from_idRequest getConceptRequest = new Get_concept_from_idRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        getConceptRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        getConceptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        getConceptRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        getConceptRequest.setTypeAttribute("GoldText");
        Get_concept_from_idResult getConceptResult = sdkClient.get_concept_from_id(getConceptRequest);
        Concept concept = getConceptResult.getConcept();
        Update_conceptRequest updateConceptRequest = new Update_conceptRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        updateConceptRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        updateConceptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        updateConceptRequest.setConceptId("d45e5143-b329-45b8-812f-8c01372cb47b");
        updateConceptRequest.setConcept(concept);
        Update_conceptResult conceptResult = sdkClient.update_concept(updateConceptRequest);
        assertEquals("bug with update concept",conceptResult.getConcept().getId(),"d45e5143-b329-45b8-812f-8c01372cb47b");
    }

    @Test
    public void testCreateConcept()
    {
        Create_conceptRequest conceptRequest = new Create_conceptRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        conceptRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        conceptRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        Concept concept = new Concept();
        concept.setName("TestConcept");
        conceptRequest.setConcept(concept);
        Create_conceptResult conceptResult = sdkClient.create_concept(conceptRequest);
        Get_all_conceptsRequest get_all_conceptsRequest = new Get_all_conceptsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        get_all_conceptsRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        get_all_conceptsRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        Get_all_conceptsResult conceptResults = sdkClient.get_all_concepts(get_all_conceptsRequest);
        assertNotEquals("problem with create concept", conceptResults.getListConcepts().getConcepts().size(),0);
    }
}
