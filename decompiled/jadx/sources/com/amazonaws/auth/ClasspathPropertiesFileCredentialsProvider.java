package com.amazonaws.auth;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {
    private static String defaultPropertiesFile = "AwsCredentials.properties";
    private final String credentialsFilePath;

    public ClasspathPropertiesFileCredentialsProvider(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Credentials file path cannot be null");
            throw null;
        }
        if (str.startsWith("/")) {
            this.credentialsFilePath = str;
        } else {
            this.credentialsFilePath = "/".concat(str);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.credentialsFilePath);
        if (resourceAsStream == null) {
            Classes$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(new StringBuilder("Unable to load AWS credentials from the "), this.credentialsFilePath, " file on the classpath"));
            return null;
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            Classes$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(new StringBuilder("Unable to load AWS credentials from the "), this.credentialsFilePath, " file on the classpath"), e);
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        return a$$ExternalSyntheticOutline0.m(sb, this.credentialsFilePath, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
    }

    public ClasspathPropertiesFileCredentialsProvider() {
        this(defaultPropertiesFile);
    }
}
