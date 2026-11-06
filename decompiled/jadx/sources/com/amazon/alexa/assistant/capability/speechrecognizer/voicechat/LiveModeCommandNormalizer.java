package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import java.text.Normalizer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandNormalizer;", "", "<init>", "()V", "MAX_INPUT_LENGTH", "", "IGNORED_SCALARS", "Lkotlin/text/Regex;", "SEPARATORS", "APOSTROPHES", "EDGE_NOISE", "WHITESPACE", "LEADING_WAKE_WORD", "normalize", "", "raw", "locale", "Ljava/util/Locale;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LiveModeCommandNormalizer {
    private static final int MAX_INPUT_LENGTH = 128;

    @NotNull
    public static final LiveModeCommandNormalizer INSTANCE = new LiveModeCommandNormalizer();

    @NotNull
    private static final Regex IGNORED_SCALARS = new Regex("[\\u00AD\\u0640\\u064B-\\u065F\\u0670\\u200B-\\u200F\\u202A-\\u202E\\u2060-\\u2064\\u2066-\\u2069\\uFEFF]");

    @NotNull
    private static final Regex SEPARATORS = new Regex("[,\\u060C\\u3001\\uFF0C:\\uFF1A;\\u061B\\uFF1B]");

    @NotNull
    private static final Regex APOSTROPHES = new Regex("['\\u2018\\u2019\\u02BC\\u055A\\uFF07\\u0060\\u00B4]");

    @NotNull
    private static final Regex EDGE_NOISE = new Regex("^[\\p{P}\\p{S}\\s]+|[\\p{P}\\p{S}\\s]+$");

    @NotNull
    private static final Regex WHITESPACE = new Regex("\\s+");

    @NotNull
    private static final Regex LEADING_WAKE_WORD = new Regex("^alexa[\\p{P}\\s]+");

    private LiveModeCommandNormalizer() {
    }

    @NotNull
    public final String normalize(@Nullable String raw, @NotNull Locale locale) {
        locale.getClass();
        if (raw == null || raw.length() > 128) {
            return "";
        }
        String normalize = Normalizer.normalize(raw, Normalizer.Form.NFKC);
        Regex regex = IGNORED_SCALARS;
        normalize.getClass();
        String lowerCase = APOSTROPHES.replace(SEPARATORS.replace(regex.replace(normalize, ""), " "), "").toLowerCase(locale);
        lowerCase.getClass();
        return LEADING_WAKE_WORD.replaceFirst(StringsKt.trim((CharSequence) WHITESPACE.replace(EDGE_NOISE.replace(lowerCase, ""), " ")).toString(), "");
    }
}
