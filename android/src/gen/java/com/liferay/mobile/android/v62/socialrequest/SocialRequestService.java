package com.liferay.mobile.android.v62.socialrequest;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/socialrequest")
public interface SocialRequestService {
  @Path("/update-request")
  Call<JSONObject> updateRequest(@Param("requestId") long requestId, @Param("status") int status, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);
}
