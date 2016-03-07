package com.liferay.mobile.android.v62.ddmstructure;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddmstructure")
public interface DDMStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param("groupId") long groupId, @Param("parentStructureId") long parentStructureId, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @Param("storageType") String storageType, @Param("type") int type, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param("userId") long userId, @Param("groupId") long groupId, @Param("parentStructureKey") String parentStructureKey, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @Param("storageType") String storageType, @Param("type") int type, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param("userId") long userId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param("structureId") long structureId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param("structureId") long structureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-structure")
  Call<Response> deleteStructure(@Param("structureId") long structureId);

  @Path("/fetch-structure")
  Call<JSONObject> fetchStructure(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param("structureId") long structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey, @Param("includeGlobalStructures") boolean includeGlobalStructures);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param("groupId") long groupId);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param("groupIds") JSONArray groupIds);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("name") String name, @Param("description") String description, @Param("storageType") String storageType, @Param("type") int type, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("keywords") String keywords, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("name") String name, @Param("description") String description, @Param("storageType") String storageType, @Param("type") int type, @Param("andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param("structureId") long structureId, @Param("parentStructureId") long parentStructureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param("groupId") long groupId, @Param("parentStructureId") long parentStructureId, @Param("classNameId") long classNameId, @Param("structureKey") String structureKey, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
