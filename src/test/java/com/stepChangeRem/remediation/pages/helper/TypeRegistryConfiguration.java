//package com.stepChangeRem.remediation.pages.helper;
//
//import com.gargoylesoftware.htmlunit.javascript.host.geo.Geolocation;
//import com.stepChangeRem.remediation.pages.helper.vo.ClientNeedsVO;
//import cucumber.api.DataTable;
//import cucumber.api.TypeRegistry;
//import cucumber.api.TypeRegistryConfigurer;
//import io.cucumber.datatable.DataTableType;
//import io.cucumber.datatable.TableEntryTransformer;
//import io.cucumber.datatable.TableTransformer;
//
//import javax.xml.crypto.Data;
//import java.util.List;
//import java.util.Locale;
//import java.util.Map;
//
//public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
//
//
//
//
//    @Override
//    public Locale locale() {
//        return null;
//    }
//
//    @Override
//    public void configureTypeRegistry(TypeRegistry registry) {
//        registry.defineDataTableType(new DataTableType(ClientNeedsVO.class,new TableTransformer<ClientNeedsVO>()
//        {
//            @Override
//            public ClientNeedsVO transform(io.cucumber.datatable.DataTable dataTable) throws Throwable {
//
//                List<Map<String, String>> maps = dataTable.asMaps();
//                return clientNeeds;
//            }
//
//
//
//        }));
//}
//}
