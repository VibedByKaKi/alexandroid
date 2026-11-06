package io.branch.referral.validators;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda3;
import io.branch.referral.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LinkingValidatorDialog extends Dialog implements AdapterView.OnItemSelectedListener {
    private final Button ctaButton;
    private final LinearLayout customKVPField;
    private final Spinner linkingValidatorDropdownMenu;
    private final EditText linkingValidatorEditText;
    private final LinearLayout linkingValidatorRowsLayout;
    private final TextView linkingValidatorText;
    private String routingKey;
    private ROUTING_TYPE routingType;
    private String routingValue;
    private LinkingValidatorDialogRowItem row1;
    private LinkingValidatorDialogRowItem row2;
    private LinkingValidatorDialogRowItem row3;
    private LinkingValidatorDialogRowItem row4;
    private LinkingValidatorDialogRowItem row5;
    private LinkingValidatorDialogRowItem row6;
    private int step;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: io.branch.referral.validators.LinkingValidatorDialog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE;

        static {
            int[] iArr = new int[ROUTING_TYPE.values().length];
            $SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE = iArr;
            try {
                iArr[ROUTING_TYPE.CANONICAL_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE[ROUTING_TYPE.DEEPLINK_PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE[ROUTING_TYPE.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ROUTING_TYPE {
        CANONICAL_URL,
        DEEPLINK_PATH,
        CUSTOM
    }

    public LinkingValidatorDialog(Context context) {
        super(context);
        this.step = 1;
        this.routingKey = "";
        this.routingValue = "";
        requestWindowFeature(1);
        setContentView(R.layout.dialog_linking_validator);
        Spinner spinner = (Spinner) findViewById(R.id.linkingValidatorDropdownMenu);
        this.linkingValidatorDropdownMenu = spinner;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_item, ChatData$$ExternalSyntheticOutline0.m16641m(LinkingValidatorConstants.canonicalUrlKey, "$deeplink_path", "other (custom)"));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        Button button = (Button) findViewById(R.id.linkingValidatorButton);
        this.ctaButton = button;
        button.setText("Next");
        button.setOnClickListener(new SearchBarView$$ExternalSyntheticLambda3(this, 14));
        this.linkingValidatorText = (TextView) findViewById(R.id.linkingValidatorText);
        EditText editText = (EditText) findViewById(R.id.linkingValidatorEditText);
        this.linkingValidatorEditText = editText;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.customKVPField);
        this.customKVPField = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.linkingValidatorRows);
        this.linkingValidatorRowsLayout = linearLayout2;
        editText.setVisibility(8);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        this.routingType = ROUTING_TYPE.CANONICAL_URL;
        this.row1 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow1);
        this.row2 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow2);
        this.row3 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow3);
        this.row4 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow4);
        this.row5 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow5);
        this.row6 = (LinkingValidatorDialogRowItem) findViewById(R.id.linkingValidatorRow6);
    }

    private void CloseDialog() {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        int i = this.step;
        if (i == 1) {
            LoadStep2Screen();
        } else if (i == 2) {
            GenerateBranchLinks();
        } else {
            if (i != 3) {
                return;
            }
            CloseDialog();
        }
    }

    public void GenerateBranchLinks() {
        int i = AnonymousClass1.$SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE[this.routingType.ordinal()];
        if (i == 1) {
            this.routingKey = LinkingValidatorConstants.canonicalUrlKey;
            this.routingValue = this.linkingValidatorEditText.getText().toString();
        } else if (i == 2) {
            this.routingKey = "$deeplink_path";
            this.routingValue = this.linkingValidatorEditText.getText().toString();
        }
        this.step++;
        this.linkingValidatorEditText.setVisibility(8);
        this.customKVPField.setVisibility(8);
        this.linkingValidatorText.setVisibility(8);
        this.ctaButton.setText(LinkingValidatorConstants.step3ButtonText);
        this.linkingValidatorRowsLayout.setVisibility(0);
        EditText editText = (EditText) findViewById(R.id.keyEditText);
        EditText editText2 = (EditText) findViewById(R.id.valueEditText);
        if (this.routingKey.isEmpty()) {
            this.routingKey = editText.getText().toString();
            this.routingValue = editText2.getText().toString();
        }
        this.row1.InitializeRow(LinkingValidatorConstants.linkingValidatorRow1Title, LinkingValidatorConstants.infoButton1Text, LinkingValidatorConstants.debugButton1Text, this.routingKey, this.routingValue, "regularBranchLink", true, 0, new String[0]);
        this.row2.InitializeRow(LinkingValidatorConstants.linkingValidatorRow2Title, LinkingValidatorConstants.infoButton2Text, LinkingValidatorConstants.debugButton2Text, this.routingKey, this.routingValue, "uriFallbackBranchLink", true, 1, "$uri_redirect_mode", "2");
        this.row3.InitializeRow(LinkingValidatorConstants.linkingValidatorRow3Title, LinkingValidatorConstants.infoButton3Text, LinkingValidatorConstants.debugButton3Text, this.routingKey, this.routingValue, "webOnlyBranchLink", true, 2, "$web_only", "true");
        this.row4.InitializeRow(LinkingValidatorConstants.linkingValidatorRow4Title, LinkingValidatorConstants.infoButton4Text, LinkingValidatorConstants.debugButton4Text, this.routingKey, "", "missingDataBranchLink", true, 3, new String[0]);
        this.row5.InitializeRow(LinkingValidatorConstants.linkingValidatorRow5Title, LinkingValidatorConstants.infoButton5Text, LinkingValidatorConstants.debugButton5Text, this.routingKey, this.routingValue, "warmStartUseCase", false, 4, new String[0]);
        this.row6.InitializeRow(LinkingValidatorConstants.linkingValidatorRow6Title, LinkingValidatorConstants.infoButton6Text, LinkingValidatorConstants.debugButton6Text, this.routingKey, this.routingValue, "foregroundClickUseCase", false, 5, new String[0]);
    }

    public void LoadStep2Screen() {
        this.step++;
        this.ctaButton.setText(LinkingValidatorConstants.step2ButtonText);
        this.linkingValidatorDropdownMenu.setVisibility(8);
        int i = AnonymousClass1.$SwitchMap$io$branch$referral$validators$LinkingValidatorDialog$ROUTING_TYPE[this.routingType.ordinal()];
        if (i == 1) {
            this.linkingValidatorEditText.setVisibility(0);
            this.linkingValidatorText.setText(LinkingValidatorConstants.canonicalURLPromptText);
        } else if (i == 2) {
            this.linkingValidatorEditText.setVisibility(0);
            this.linkingValidatorText.setText(LinkingValidatorConstants.deeplinkPathPromptText);
        } else {
            if (i != 3) {
                return;
            }
            this.customKVPField.setVisibility(0);
            this.linkingValidatorText.setText(LinkingValidatorConstants.customKeyPromptText);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = adapterView.getItemAtPosition(i).toString();
        obj.getClass();
        switch (obj) {
            case "other (custom)":
                this.routingType = ROUTING_TYPE.CUSTOM;
                break;
            case "$deeplink_path":
                this.routingType = ROUTING_TYPE.DEEPLINK_PATH;
                break;
            case "$canonical_url":
                this.routingType = ROUTING_TYPE.CANONICAL_URL;
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
