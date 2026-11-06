package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PropertiesCredentials implements AWSCredentials {
    private final String accessKey;
    private final String secretAccessKey;

    public PropertiesCredentials(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.accessKey = properties.getProperty("accessKey");
            this.secretAccessKey = properties.getProperty("secretKey");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSAccessKeyId() {
        return this.accessKey;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSSecretKey() {
        return this.secretAccessKey;
    }

    public PropertiesCredentials(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            if (properties.getProperty("accessKey") != null && properties.getProperty("secretKey") != null) {
                this.accessKey = properties.getProperty("accessKey");
                this.secretAccessKey = properties.getProperty("secretKey");
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
                throw null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
