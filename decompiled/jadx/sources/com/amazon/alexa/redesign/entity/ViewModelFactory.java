package com.amazon.alexa.redesign.entity;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.redesign.HomeContract;
import com.amazon.alexa.redesign.actions.ActionFactory;
import com.amazon.alexa.redesign.entity.templates.TemplateType;
import com.amazon.alexa.redesign.entity.viewtypes.BorderedTextButtonModel;
import com.amazon.alexa.redesign.entity.viewtypes.EmptyModel;
import com.amazon.alexa.redesign.entity.viewtypes.ExpandableSectionHeaderModel;
import com.amazon.alexa.redesign.entity.viewtypes.HeaderModel;
import com.amazon.alexa.redesign.entity.viewtypes.IconTitleSubtitleHintModel;
import com.amazon.alexa.redesign.entity.viewtypes.IconTitleSubtitleModel;
import com.amazon.alexa.redesign.entity.viewtypes.ImageButtonModel;
import com.amazon.alexa.redesign.entity.viewtypes.ImageModel;
import com.amazon.alexa.redesign.entity.viewtypes.OptInBottomSheetModel;
import com.amazon.alexa.redesign.entity.viewtypes.SectionHeaderModel;
import com.amazon.alexa.redesign.entity.viewtypes.SectionListModel;
import com.amazon.alexa.redesign.entity.viewtypes.ShortcutsItemModel;
import com.amazon.alexa.redesign.entity.viewtypes.SpacerModel;
import com.amazon.alexa.redesign.entity.viewtypes.TextButtonModel;
import com.amazon.alexa.redesign.entity.viewtypes.TileFooterImageBackgroundItemModel;
import com.amazon.alexa.redesign.entity.viewtypes.TileFooterImageItemModel;
import com.amazon.alexa.redesign.entity.viewtypes.TileFooterTextItemModel;
import com.amazon.alexa.redesign.entity.viewtypes.TilesGridModel;
import com.amazon.alexa.redesign.entity.viewtypes.TitleSubtitleModel;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import com.amazon.alexa.redesign.utils.HomeCardsProducer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ViewModelFactory {
    private final ActionFactory actionFactory;

    @VisibleForTesting
    final Map<String, Factory<ViewTypeModel>> viewModelFactories;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory<ReturnType> {
        ReturnType create(JSONObject jSONObject) throws JSONException, IllegalArgumentException;
    }

    public ViewModelFactory(final ActionFactory actionFactory, final Map<TemplateType, HomeCardsProducer.NewCardFactory<CardModel>> map, final HomeContract.OEInteractor oEInteractor, final boolean z, final HomeContract.HomeMetricsRecorder homeMetricsRecorder) {
        this.actionFactory = actionFactory;
        HashMap hashMap = new HashMap();
        this.viewModelFactories = hashMap;
        final int i = 0;
        hashMap.put(ImageModel.IMAGE_MODEL_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i2 = i;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i2) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i2 = 1;
        hashMap.put(IconTitleSubtitleModel.ICON_TITLE_SUBTITLE_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i2;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i3 = 2;
        hashMap.put(ImageButtonModel.IMAGE_BUTTON_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i3;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i4 = 3;
        hashMap.put(TextButtonModel.TEXT_BUTTON_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i4;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i5 = 4;
        hashMap.put(BorderedTextButtonModel.BORDERED_TEXT_BUTTON_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i5;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        hashMap.put(EmptyModel.EMPTY_MODEL, new ViewModelFactory$$ExternalSyntheticLambda15());
        final int i6 = 5;
        hashMap.put(TitleSubtitleModel.TITLE_SUBTITLE_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i6;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i7 = 6;
        hashMap.put(IconTitleSubtitleModel.ICON_TITLE_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i7;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i8 = 7;
        hashMap.put(IconTitleSubtitleHintModel.ICON_TITLE_SUBTITLE_HINT_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i8;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i9 = 8;
        hashMap.put(HeaderModel.HEADER_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i9;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i10 = 9;
        hashMap.put(ShortcutsItemModel.SHORTCUTS_ITEM_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i10;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i11 = 10;
        hashMap.put(OptInBottomSheetModel.OPT_IN_BOTTOM_SHEET_TYPE, new Factory(this) { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewModelFactory f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$0;
                ViewTypeModel lambda$new$1;
                ViewTypeModel lambda$new$2;
                ViewTypeModel lambda$new$3;
                ViewTypeModel lambda$new$4;
                ViewTypeModel lambda$new$6;
                ViewTypeModel lambda$new$7;
                ViewTypeModel lambda$new$8;
                ViewTypeModel lambda$new$9;
                ViewTypeModel lambda$new$10;
                ViewTypeModel lambda$new$11;
                int i22 = i11;
                ViewModelFactory viewModelFactory = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$new$0 = viewModelFactory.lambda$new$0(jSONObject);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = viewModelFactory.lambda$new$1(jSONObject);
                        return lambda$new$1;
                    case 2:
                        lambda$new$2 = viewModelFactory.lambda$new$2(jSONObject);
                        return lambda$new$2;
                    case 3:
                        lambda$new$3 = viewModelFactory.lambda$new$3(jSONObject);
                        return lambda$new$3;
                    case 4:
                        lambda$new$4 = viewModelFactory.lambda$new$4(jSONObject);
                        return lambda$new$4;
                    case 5:
                        lambda$new$6 = viewModelFactory.lambda$new$6(jSONObject);
                        return lambda$new$6;
                    case 6:
                        lambda$new$7 = viewModelFactory.lambda$new$7(jSONObject);
                        return lambda$new$7;
                    case 7:
                        lambda$new$8 = viewModelFactory.lambda$new$8(jSONObject);
                        return lambda$new$8;
                    case 8:
                        lambda$new$9 = viewModelFactory.lambda$new$9(jSONObject);
                        return lambda$new$9;
                    case 9:
                        lambda$new$10 = viewModelFactory.lambda$new$10(jSONObject);
                        return lambda$new$10;
                    default:
                        lambda$new$11 = viewModelFactory.lambda$new$11(jSONObject);
                        return lambda$new$11;
                }
            }
        });
        final int i12 = 0;
        hashMap.put(SectionHeaderModel.SECTION_HEADER_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i13 = i12;
                ActionFactory actionFactory2 = actionFactory;
                switch (i13) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i13 = 1;
        hashMap.put(ExpandableSectionHeaderModel.EXPANDABLE_SECTION_HEADER_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i132 = i13;
                ActionFactory actionFactory2 = actionFactory;
                switch (i132) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i14 = 0;
        hashMap.put(TilesGridModel.TILES_GRID_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda5
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$14;
                ViewTypeModel lambda$new$19;
                switch (i14) {
                    case 0:
                        lambda$new$14 = ViewModelFactory.lambda$new$14(map, actionFactory, oEInteractor, z, homeMetricsRecorder, jSONObject);
                        return lambda$new$14;
                    default:
                        lambda$new$19 = ViewModelFactory.lambda$new$19(map, actionFactory, oEInteractor, z, homeMetricsRecorder, jSONObject);
                        return lambda$new$19;
                }
            }
        });
        final int i15 = 2;
        hashMap.put(TileFooterImageBackgroundItemModel.TILE_FOOTER_IMAGE_BACKGROUND_ITEM_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i132 = i15;
                ActionFactory actionFactory2 = actionFactory;
                switch (i132) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i16 = 3;
        hashMap.put(TileFooterTextItemModel.TILE_FOOTER_TEXT_ITEM_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i132 = i16;
                ActionFactory actionFactory2 = actionFactory;
                switch (i132) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i17 = 4;
        hashMap.put(SpacerModel.SPACER_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i132 = i17;
                ActionFactory actionFactory2 = actionFactory;
                switch (i132) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i18 = 5;
        hashMap.put(TileFooterImageItemModel.TILE_FOOTER_IMAGE_ITEM_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda3
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$12;
                ViewTypeModel lambda$new$13;
                ViewTypeModel lambda$new$15;
                ViewTypeModel lambda$new$16;
                ViewTypeModel lambda$new$17;
                ViewTypeModel lambda$new$18;
                int i132 = i18;
                ActionFactory actionFactory2 = actionFactory;
                switch (i132) {
                    case 0:
                        lambda$new$12 = ViewModelFactory.lambda$new$12(actionFactory2, jSONObject);
                        return lambda$new$12;
                    case 1:
                        lambda$new$13 = ViewModelFactory.lambda$new$13(actionFactory2, jSONObject);
                        return lambda$new$13;
                    case 2:
                        lambda$new$15 = ViewModelFactory.lambda$new$15(actionFactory2, jSONObject);
                        return lambda$new$15;
                    case 3:
                        lambda$new$16 = ViewModelFactory.lambda$new$16(actionFactory2, jSONObject);
                        return lambda$new$16;
                    case 4:
                        lambda$new$17 = ViewModelFactory.lambda$new$17(actionFactory2, jSONObject);
                        return lambda$new$17;
                    default:
                        lambda$new$18 = ViewModelFactory.lambda$new$18(actionFactory2, jSONObject);
                        return lambda$new$18;
                }
            }
        });
        final int i19 = 1;
        hashMap.put(SectionListModel.SECTION_LIST_TYPE, new Factory() { // from class: com.amazon.alexa.redesign.entity.ViewModelFactory$$ExternalSyntheticLambda5
            @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
            public final Object create(JSONObject jSONObject) {
                ViewTypeModel lambda$new$14;
                ViewTypeModel lambda$new$19;
                switch (i19) {
                    case 0:
                        lambda$new$14 = ViewModelFactory.lambda$new$14(map, actionFactory, oEInteractor, z, homeMetricsRecorder, jSONObject);
                        return lambda$new$14;
                    default:
                        lambda$new$19 = ViewModelFactory.lambda$new$19(map, actionFactory, oEInteractor, z, homeMetricsRecorder, jSONObject);
                        return lambda$new$19;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$0(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getImageModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$1(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getIconTitleSubtitleModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$10(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getShortcutsItemModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$11(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getOptInBottomSheetModel(jSONObject, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$12(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getSectionHeaderModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$13(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getExpandableSectionHeaderModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$14(Map map, ActionFactory actionFactory, HomeContract.OEInteractor oEInteractor, boolean z, HomeContract.HomeMetricsRecorder homeMetricsRecorder, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTilesGridModel(jSONObject, map, actionFactory, oEInteractor, z, homeMetricsRecorder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$15(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTitleFooterImageBackgroundItemModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$16(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTitleFooterTextItemModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$17(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getSpacerModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$18(ActionFactory actionFactory, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTitleFooterImageItemModel(jSONObject, actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewTypeModel lambda$new$19(Map map, ActionFactory actionFactory, HomeContract.OEInteractor oEInteractor, boolean z, HomeContract.HomeMetricsRecorder homeMetricsRecorder, JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getSectionListModel(jSONObject, map, actionFactory, oEInteractor, z, homeMetricsRecorder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$2(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getImageButtonModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$3(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTextButtonModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$4(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getBorderedTextButtonModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$6(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getTitleSubtitleModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$7(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getIconTitleSubtitleModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$8(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getSkillsModel(jSONObject, this.actionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewTypeModel lambda$new$9(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return ViewModelFactoryUtil.getHeaderModel(jSONObject, this.actionFactory);
    }

    public ViewTypeModel getModel(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        Factory<ViewTypeModel> factory = this.viewModelFactories.get(ViewModelFactoryUtil.getViewType(jSONObject));
        if (factory != null) {
            return factory.create(jSONObject);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("HomeChannelNative: ViewType is not in ViewModelFactoryMap");
        return null;
    }
}
