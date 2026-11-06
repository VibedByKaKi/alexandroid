package org.commonmark.internal.renderer.text;

import org.commonmark.node.BulletList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BulletListHolder extends ListHolder {
    private final char marker;

    public BulletListHolder(ListHolder listHolder, BulletList bulletList) {
        super(listHolder);
        this.marker = bulletList.getBulletMarker();
    }

    public char getMarker() {
        return this.marker;
    }
}
