package com.amazon.alexa.voice.tta.simba;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"EXTRA_SIMBA_ACTION", "", "EXTRA_REQUESTED_LOCALE", "GET_SUGGESTIONS", "", "GET_SEARCH", "UPDATE_INTERACTION", "GET_FRICATIVE_PROMPTS", "EXTRA_SUGGESTION_QUERY", "EXTRA_SEARCH_AVS_RESPONSE_EMPTY", "EXTRA_SEARCH_AVS_RESPONSE_TOKEN", "EXTRA_SEARCH_AVS_PROMPT_TD", "EXTRA_SEARCH_AVS_NAMESPACE", "EXTRA_SEARCH_AVS_VARIANT", "EXTRA_SEARCH_QUERY", "EXTRA_RESULT_CODE_SUGGESTIONS", "EXTRA_RESULT_CODE_SEARCH", "EXTRA_RESULT_CODE_FRICTIVE_PROMPTS", "EXTRA_RESULT_CODE_UPDATE_INTERACTION", "ERROR_CODE_SEARCH_API", "ERROR_CODE_SUGGESTIONS_API", "ERROR_CODE_FRICTIVE_PROMPTS_API", "ERROR_CODE_SEARCH_API_TIMEOUT", "ERROR_CODE_UPDATE_INTERACTION_API", "SIMBA_SUGGESTION_RESPONSE", "SIMBA_SEARCH_RESPONSE", "SIMBA_FRICATIVE_RESPONSE", "SIMBA_INTERACTION_RESPONSE", "SIMBA_ERROR", "EXTRA_UPDATE_INTERACTION_ID", "SIMBA_SEARCH_INTENT_ACTION", Constants.LOG_TAG, "AlexaMobileAndroidVoice-TTA_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SuggestionServiceClientKt {
    public static final int ERROR_CODE_FRICTIVE_PROMPTS_API = 1002;
    public static final int ERROR_CODE_SEARCH_API = 1000;
    public static final int ERROR_CODE_SEARCH_API_TIMEOUT = 1003;
    public static final int ERROR_CODE_SUGGESTIONS_API = 1001;
    public static final int ERROR_CODE_UPDATE_INTERACTION_API = 1004;

    @NotNull
    public static final String EXTRA_REQUESTED_LOCALE = "requested_locale";
    public static final int EXTRA_RESULT_CODE_FRICTIVE_PROMPTS = 3;
    public static final int EXTRA_RESULT_CODE_SEARCH = 2;
    public static final int EXTRA_RESULT_CODE_SUGGESTIONS = 1;
    public static final int EXTRA_RESULT_CODE_UPDATE_INTERACTION = 4;

    @NotNull
    public static final String EXTRA_SEARCH_AVS_NAMESPACE = "avs_namespace";

    @NotNull
    public static final String EXTRA_SEARCH_AVS_PROMPT_TD = "avs_prompt_id";

    @NotNull
    public static final String EXTRA_SEARCH_AVS_RESPONSE_EMPTY = "avs_response_empty";

    @NotNull
    public static final String EXTRA_SEARCH_AVS_RESPONSE_TOKEN = "avs_response_token";

    @NotNull
    public static final String EXTRA_SEARCH_AVS_VARIANT = "avs_variant_id";

    @NotNull
    public static final String EXTRA_SEARCH_QUERY = "search_query";

    @NotNull
    public static final String EXTRA_SIMBA_ACTION = "simba_action";

    @NotNull
    public static final String EXTRA_SUGGESTION_QUERY = "suggestion_query";

    @NotNull
    public static final String EXTRA_UPDATE_INTERACTION_ID = "selected_id";
    public static final int GET_FRICATIVE_PROMPTS = 4;
    public static final int GET_SEARCH = 2;
    public static final int GET_SUGGESTIONS = 1;

    @NotNull
    public static final String SIMBA_ERROR = "SIMBA_ERROR";

    @NotNull
    public static final String SIMBA_FRICATIVE_RESPONSE = "fricativeSimbaResponse";

    @NotNull
    public static final String SIMBA_INTERACTION_RESPONSE = "interactionSimbaResponse";

    @NotNull
    private static final String SIMBA_SEARCH_INTENT_ACTION = "amazon.intent.action.SIMBA_SEARCH";

    @NotNull
    public static final String SIMBA_SEARCH_RESPONSE = "searchSimbaResponse";

    @NotNull
    public static final String SIMBA_SUGGESTION_RESPONSE = "suggestionSimbaResponse";

    @NotNull
    private static final String TAG = "SuggestionServiceClient";
    public static final int UPDATE_INTERACTION = 3;
}
