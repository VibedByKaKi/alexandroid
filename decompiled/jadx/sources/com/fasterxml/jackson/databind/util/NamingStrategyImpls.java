package com.fasterxml.jackson.databind.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum NamingStrategyImpls {
    LOWER_CAMEL_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.1
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return str;
        }
    },
    UPPER_CAMEL_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.2
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }
            char charAt = str.charAt(0);
            char upperCase = Character.toUpperCase(charAt);
            if (charAt == upperCase) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    },
    SNAKE_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.3
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        }
    },
    UPPER_SNAKE_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.4
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            String translate = NamingStrategyImpls.SNAKE_CASE.translate(str);
            if (translate == null) {
                return null;
            }
            return translate.toUpperCase();
        }
    },
    LOWER_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.5
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return (str == null || str.isEmpty()) ? str : str.toLowerCase();
        }
    },
    KEBAB_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.6
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return NamingStrategyImpls.translateLowerCaseWithSeparator(str, '-');
        }
    },
    LOWER_DOT_CASE { // from class: com.fasterxml.jackson.databind.util.NamingStrategyImpls.7
        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return NamingStrategyImpls.translateLowerCaseWithSeparator(str, '.');
        }
    };

    public static String translateLowerCaseWithSeparator(String str, char c) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder((length >> 1) + length);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            char lowerCase = Character.toLowerCase(charAt);
            if (lowerCase == charAt) {
                if (i > 1) {
                    sb.insert(sb.length() - 1, c);
                }
                i = 0;
            } else {
                if (i == 0 && i2 > 0) {
                    sb.append(c);
                }
                i++;
            }
            sb.append(lowerCase);
        }
        return sb.toString();
    }

    public abstract String translate(String str);
}
