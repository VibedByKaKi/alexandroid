package org.commonmark.parser.delimiter;

import org.commonmark.node.Text;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DelimiterRun {
    boolean canClose();

    boolean canOpen();

    Text getCloser();

    Iterable<Text> getClosers(int i);

    Text getOpener();

    Iterable<Text> getOpeners(int i);

    int length();

    int originalLength();
}
