package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ILocaleObject<T> {
    ILocaleObject<T> cloneObject() throws JSRangeErrorException;

    T getLocale() throws JSRangeErrorException;

    T getLocaleWithoutExtensions() throws JSRangeErrorException;

    ArrayList<String> getUnicodeExtensions(String str) throws JSRangeErrorException;

    HashMap<String, String> getUnicodeExtensions() throws JSRangeErrorException;

    void setUnicodeExtensions(String str, ArrayList<String> arrayList) throws JSRangeErrorException;

    String toCanonicalTag() throws JSRangeErrorException;

    String toCanonicalTagWithoutExtensions() throws JSRangeErrorException;
}
