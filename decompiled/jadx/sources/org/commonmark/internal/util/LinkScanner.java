package org.commonmark.internal.util;

import kotlin.text.Typography;
import org.commonmark.internal.inline.Scanner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LinkScanner {
    public static boolean scanLinkDestination(Scanner scanner) {
        char peek;
        if (!scanner.hasNext()) {
            return false;
        }
        if (!scanner.next(Typography.less)) {
            return scanLinkDestinationWithBalancedParens(scanner);
        }
        while (scanner.hasNext() && (peek = scanner.peek()) != '\n' && peek != '<') {
            if (peek == '>') {
                scanner.next();
                return true;
            }
            if (peek != '\\') {
                scanner.next();
            } else {
                scanner.next();
                if (Parsing.isEscapable(scanner.peek())) {
                    scanner.next();
                }
            }
        }
        return false;
    }

    private static boolean scanLinkDestinationWithBalancedParens(Scanner scanner) {
        int i = 0;
        boolean z = true;
        while (scanner.hasNext()) {
            char peek = scanner.peek();
            if (peek == ' ') {
                return !z;
            }
            if (peek == '\\') {
                scanner.next();
                if (Parsing.isEscapable(scanner.peek())) {
                    scanner.next();
                }
            } else if (peek == '(') {
                i++;
                if (i > 32) {
                    return false;
                }
                scanner.next();
            } else if (peek != ')') {
                if (Character.isISOControl(peek)) {
                    return !z;
                }
                scanner.next();
            } else {
                if (i == 0) {
                    return true;
                }
                i--;
                scanner.next();
            }
            z = false;
        }
        return true;
    }

    public static boolean scanLinkLabelContent(Scanner scanner) {
        while (scanner.hasNext()) {
            switch (scanner.peek()) {
                case '[':
                    return false;
                case '\\':
                    scanner.next();
                    if (!Parsing.isEscapable(scanner.peek())) {
                        break;
                    } else {
                        scanner.next();
                        break;
                    }
                case ']':
                    return true;
                default:
                    scanner.next();
                    break;
            }
        }
        return true;
    }

    public static boolean scanLinkTitle(Scanner scanner) {
        if (!scanner.hasNext()) {
            return false;
        }
        char peek = scanner.peek();
        char c = '\"';
        if (peek != '\"') {
            c = '\'';
            if (peek != '\'') {
                if (peek != '(') {
                    return false;
                }
                c = ')';
            }
        }
        scanner.next();
        if (!scanLinkTitleContent(scanner, c) || !scanner.hasNext()) {
            return false;
        }
        scanner.next();
        return true;
    }

    public static boolean scanLinkTitleContent(Scanner scanner, char c) {
        while (scanner.hasNext()) {
            char peek = scanner.peek();
            if (peek == '\\') {
                scanner.next();
                if (Parsing.isEscapable(scanner.peek())) {
                    scanner.next();
                }
            } else {
                if (peek == c) {
                    return true;
                }
                if (c == ')' && peek == '(') {
                    return false;
                }
                scanner.next();
            }
        }
        return true;
    }
}
