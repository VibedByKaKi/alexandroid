package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HeaderComponent {
    private final Callback callback;
    private final Configuration configuration;
    private View headerView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onBackClicked();

        void onSettingsClicked();
    }

    public HeaderComponent(Configuration configuration, Callback callback) {
        this.configuration = configuration;
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(View view) {
        this.callback.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$1(View view) {
        this.callback.onSettingsClicked();
    }

    public void initialize(View view) {
        this.headerView = view;
        Context context = view.getContext();
        ImageView imageView = (ImageView) this.headerView.findViewById(R.id.bottomsheet_collapse);
        if (this.configuration.disableBack) {
            imageView.setVisibility(8);
        } else {
            if (this.configuration.showCollapse) {
                imageView.setImageDrawable(context.getDrawable(R.drawable.ic_caret_down));
            } else {
                imageView.setImageDrawable(context.getDrawable(R.drawable.ic_back_wrapper));
            }
            final int i = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.HeaderComponent$$ExternalSyntheticLambda0
                public final /* synthetic */ HeaderComponent f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = i;
                    HeaderComponent headerComponent = this.f$0;
                    switch (i2) {
                        case 0:
                            headerComponent.lambda$initialize$0(view2);
                            break;
                        default:
                            headerComponent.lambda$initialize$1(view2);
                            break;
                    }
                }
            });
            imageView.setVisibility(0);
        }
        View findViewById = this.headerView.findViewById(R.id.app_logo_image_view);
        TextView textView = (TextView) this.headerView.findViewById(R.id.header_title);
        textView.setText(this.configuration.title);
        if (this.configuration.showIcon) {
            findViewById.setVisibility(0);
            textView.setVisibility(8);
        } else {
            findViewById.setVisibility(8);
            textView.setVisibility(0);
        }
        View findViewById2 = this.headerView.findViewById(R.id.bottomsheet_overflow);
        if (this.configuration.disableSettings) {
            findViewById2.setVisibility(8);
            return;
        }
        findViewById2.setVisibility(0);
        final int i2 = 1;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.HeaderComponent$$ExternalSyntheticLambda0
            public final /* synthetic */ HeaderComponent f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                HeaderComponent headerComponent = this.f$0;
                switch (i22) {
                    case 0:
                        headerComponent.lambda$initialize$0(view2);
                        break;
                    default:
                        headerComponent.lambda$initialize$1(view2);
                        break;
                }
            }
        });
    }

    public void release() {
        this.headerView = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Configuration {
        private final boolean disableBack;
        private final boolean disableSettings;
        private final boolean showCollapse;
        private final boolean showIcon;
        private final String title;

        public Configuration(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.title = str;
            this.showCollapse = z;
            this.showIcon = z2;
            this.disableSettings = z3;
            this.disableBack = z4;
        }

        public Configuration(String str, boolean z, boolean z2, boolean z3) {
            this(str, z, z2, z3, false);
        }

        public Configuration(String str) {
            this(str, false, false, false, false);
        }
    }
}
