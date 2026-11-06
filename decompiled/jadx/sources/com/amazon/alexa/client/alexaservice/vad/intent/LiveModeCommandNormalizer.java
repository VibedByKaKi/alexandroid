package com.amazon.alexa.client.alexaservice.vad.intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class LiveModeCommandNormalizer {
    private static final int MAX_INPUT_LENGTH = 128;
    private static final Pattern IGNORED_SCALARS = Pattern.compile("[\\u00AD\\u0640\\u064B-\\u065F\\u0670\\u200B-\\u200F\\u202A-\\u202E\\u2060-\\u2064\\u2066-\\u2069\\uFEFF]");
    private static final Pattern SEPARATORS = Pattern.compile("[,\\u060C\\u3001\\uFF0C:\\uFF1A;\\u061B\\uFF1B]");
    private static final Pattern APOSTROPHES = Pattern.compile("['\\u2018\\u2019\\u02BC\\u055A\\uFF07\\u0060\\u00B4]");
    private static final Pattern EDGE_NOISE = Pattern.compile("^[\\p{P}\\p{S}\\s]+|[\\p{P}\\p{S}\\s]+$");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static final Pattern LEADING_WAKE_WORD = Pattern.compile("^alexa[\\p{P}\\s]+");

    private LiveModeCommandNormalizer() {
    }

    @NonNull
    public static String normalize(@Nullable String str, @NonNull Locale locale) {
        if (str == null || str.length() > 128) {
            return "";
        }
        return LEADING_WAKE_WORD.matcher(WHITESPACE.matcher(EDGE_NOISE.matcher(APOSTROPHES.matcher(SEPARATORS.matcher(IGNORED_SCALARS.matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).replaceAll("")).replaceAll(" ")).replaceAll("").toLowerCase(locale)).replaceAll("")).replaceAll(" ").trim()).replaceFirst("");
    }
}
