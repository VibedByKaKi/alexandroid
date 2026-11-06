package com.amazon.alexa.handsfree.settings.contract.quicksettings;

import com.amazon.alexa.handsfree.settings.contract.quicksettings.exceptions.TileNotPresentException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface QSTileContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void setState(int i) throws TileNotPresentException;

        void setTileActive(boolean z) throws TileNotPresentException;

        void setTileDescription(int i) throws TileNotPresentException;

        void updateTile() throws TileNotPresentException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        boolean isTileNull();

        void setContentDescription(int i);

        void setState(int i);

        void setTileActive(boolean z);

        void updateTile();
    }
}
