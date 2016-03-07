package com.liferay.mobile.android.v62.portletpreferences;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/portletpreferences")
public interface PortletPreferencesService {
  @Path("/delete-archived-preferences")
  Call<Response> deleteArchivedPreferences(@Param("portletItemId") long portletItemId);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @JsonObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @JsonObject(name = "portletItem", className = "com.liferay.portal.model.PortletItem") JSONObject portletItem, @JsonObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @JsonObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @Param("portletItemId") long portletItemId, @JsonObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @Param("name") String name, @JsonObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @JsonObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/update-archive-preferences")
  Call<Response> updateArchivePreferences(@Param("userId") long userId, @Param("groupId") long groupId, @Param("name") String name, @Param("portletId") String portletId, @JsonObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);
}
