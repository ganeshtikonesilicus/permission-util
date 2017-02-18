package com.baurine.permissionutilsample.util;

import android.Manifest;
import android.app.Activity;

import com.baurine.permissionutil.PermissionUtil;

/**
 * Created by baurine on 2/10/17.
 */

public class CheckPermissionUtil {

    private static final int LOCATION_PERMISSION_REQ_CODE = 200;

    public static void checkLocation(Activity activity,
                                     PermissionUtil.ReqPermissionCallback callback) {
        PermissionUtil.checkPermission(activity,
                Manifest.permission.ACCESS_FINE_LOCATION,
                LOCATION_PERMISSION_REQ_CODE,
                "We need location permission to locate your position",
                "We can't get your location without location permission",
                callback);
    }
}
