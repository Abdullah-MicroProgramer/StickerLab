package com.example.stickerlab.Utills;

import java.util.HashMap;

public class Constants {
    public static final int SPLASH_LENGTH = 1000;
    public static final String USER_TYPE = "userType";
    public static final String COMPANY_TYPE = "companyType";
    public static final String KEY_REF_USERS = "user";
    public static final String KEY_VERSION = "version";
    public static final String KEY_SELECTED_CAREGORY = "selected category";
    public static final String KEY_JOB_REQUEST = "jobs request";
    public static final String KEY_HELP = "help";
    public static final int PICKFILE_REQUEST_CODE = 1;
    public static final int OPEN_MAP_ACTIVITY = 3;
    public static final int REQUEST_TAKE_GALLERY_VIDEO = 2;
    public static String LON = "";
    public static final String SHARED_PREF_NAME = "Eagle Construction Group";
    public static String LAT = "";
    public static Boolean GO_FOR_WORK_LOCTAION_SHARED = false;
    public static Boolean ARRIVE_ON_LOCTAION_SHARED = false;
    public static boolean SELECT_MAP = false;
    public static boolean NAVIGATE = false;
    public static boolean mgg = false;
    public static boolean GETLOCATION = false;
    public static String SEND_ID = "send_id";

    public static final String SEARCHED_TEXT = "searched_text";
    public static final String IS_CHAT_ACTIVITY_OPENED = "isChatActivity";
    //all about notifications
    public static final String FCM_KEY = "key=AAAAnGTVn8A:APA91bEGEjgggQgif45jTpxBCQFVvBCoHj3r571WyVtWZbrp-K39CNRcZoxloo8qkZpoqj2Ls_KcBRtI4eZvh-r5QP2FOtEopAzE0MjIv9QbPnxCPmxZ2LkE0maNO3o3QUpoHsKM9tcZ";
    public static final String TYPE = "notificationType";
    public static final String REMOTE_MSG_TYPE = "type";
    public static final String REMOTE_MSG_INVITATION = "invitation";
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_INVITATION_RESPONSE = "invitationResponse";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";
    public static final String KEY_TITLE = "title";
    public static final String KEY_BODY = "body";
    public static final String TOKEN = "token";
    public static final String PNG = "png";
    public static final String JPG = "jpg";
    public static final String LOCATION = "location";
    public static final String DOCX = "docx";
    public static final String PDF = "pdf";
    public static final String ZIP = "zip";
    public static final String XML = "xml";
    public static final String JAVA = "java";
    public static final String APK = "apk";
    public static final String MP4 = "mp4";
    public static final String PROVIDER = "Provider";
    public static final String USER_DP = "dp";
    public static final int PERMISSION_REQUEST_CODE = 2296;
    public static final String FILEPATH = "storage/emulated/0/Panto & Co/";
    public static final String DIRECTORY_NAME = "Panto & Co";
    public static final String SEND_NAME = "send_name";
    public static final String SEND_USER_ID = "send_user_id";
    public static final String TEXT = "text";
    public static final String REMOTE_MSG_INVITER_TOKEN = "inviterToken";
    public static final String SEND_VIDEO_URL = "send_video_url";
    public static final HashMap<String, String> getRemoteMessageHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put(Constants.REMOTE_MSG_AUTHORIZATION,
                "key=AAAA1cpAfFQ:APA91bF2N2AtkZJP4ODpMQq2149IyDfGlay1L5FQL0HjwCLzSiWs4RqRxmGh0KH3GxiNG5PM3LkUQV9oC2TLxfL-FMn3CyJgj_0jiyAhczP7CnklS33KPrqqy0t1s99vcytCohHSq2q-");
        headers.put(Constants.REMOTE_MSG_CONTENT_TYPE, "application/json");
        return headers;
    }


}
