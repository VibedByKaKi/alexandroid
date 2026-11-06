package com.typesafe.config;

import java.net.URL;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ConfigOrigin {
    List<String> comments();

    String description();

    String filename();

    int lineNumber();

    String resource();

    URL url();

    ConfigOrigin withComments(List<String> list);

    ConfigOrigin withLineNumber(int i);
}
