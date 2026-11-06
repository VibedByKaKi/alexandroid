package com.amazon.alexa.client.alexaservice.dialog.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SsmlMetadataParser {
    private static final String NAMESPACE_PATTERN = "<namespace>(.*)</namespace>";
    private static final String PROMPT_ID_PATTERN = "<promptId>(.*)</promptId>";
    private static final String VARIANT_PATTERN = "<variant>(.*)</variant>";
    private final String ssml;

    public SsmlMetadataParser(String str) {
        this.ssml = str;
    }

    private String extractString(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public String getNamespace() {
        return extractString(this.ssml, NAMESPACE_PATTERN);
    }

    public String getPromptId() {
        return extractString(this.ssml, PROMPT_ID_PATTERN);
    }

    public String getVariant() {
        return extractString(this.ssml, VARIANT_PATTERN);
    }
}
