package com.amazon.deecomms.contacts.ui;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.util.CoboUtils;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.util.ContactUtils;
import com.amazon.deecomms.common.util.LanguageUtil;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.amazon.deecomms.contacts.model.FullContactName;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.oobe.util.ThemingUpdateUtil;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactListAdapter extends CursorAdapter {
    private static final int DISPLAY_DIVIDER = 1;
    private static final int HIDE_DIVIDER = 2;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ContactListAdapter.class);
    private static final int STATE_REGULAR_LIST_ITEM = 2;
    private static final int STATE_SECTIONED_LIST_ITEM = 1;
    private static final int STATE_UNKNOWN = 0;
    private static final int UNKNOWN_DIVIDER = 0;
    private final Context mContext;
    private final boolean mIsThemedUI;
    private int[] mListItemDividerVisibilityStates;
    private int[] mListItemStates;
    private final int mNonAlexaContactColorId;
    private final String mUserPFM;
    private final boolean shouldShowCheckbox;

    @Inject
    ThemingUpdateUtil themingUpdateUtil;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ContactViewHolder {
        private final ImageView mCheckBox;
        private final View mDivider;
        private final View mInfoDivider;
        private final TextView mInfoSection;
        private final TextView mName;
        private final TextView mSection;
        private String recipientName;

        public ContactViewHolder(View view) {
            TextView textView = (TextView) view.findViewById(R.id.first_name);
            this.mName = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.section_name);
            this.mSection = textView2;
            View findViewById = view.findViewById(R.id.divider);
            this.mDivider = findViewById;
            this.mInfoSection = (TextView) view.findViewById(R.id.information_section);
            View findViewById2 = view.findViewById(R.id.info_divider);
            this.mInfoDivider = findViewById2;
            ImageView imageView = (ImageView) view.findViewById(R.id.contact_selected_checkbox);
            this.mCheckBox = imageView;
            if (ContactListAdapter.this.mIsThemedUI && ContactListAdapter.this.themingUpdateUtil.isMosaicThemingEnabled()) {
                ContactListAdapter.this.themingUpdateUtil.applyColorToTextView(textView, ContactListAdapter.this.mContext, R.attr.mosaicNeutral10);
                ContactListAdapter.this.themingUpdateUtil.applyBackgroundColorToView(findViewById, ContactListAdapter.this.mContext, R.attr.mosaicNeutral50);
                ContactListAdapter.this.themingUpdateUtil.applyBackgroundColorToView(textView2, ContactListAdapter.this.mContext, R.attr.mosaicNeutral50);
                ContactListAdapter.this.themingUpdateUtil.applyColorToTextView(textView2, ContactListAdapter.this.mContext, R.attr.mosaicNeutral20);
                ContactListAdapter.this.themingUpdateUtil.applyBackgroundColorToView(findViewById2, ContactListAdapter.this.mContext, R.attr.mosaicNeutral10);
                ContactListAdapter.this.themingUpdateUtil.applyTintColorToImageView(imageView, ContactListAdapter.this.mContext, R.attr.mosaicNeutral20);
            }
            imageView.setVisibility(ContactListAdapter.this.shouldShowCheckbox ? 0 : 8);
        }

        private Character getFirstCharByJP(Cursor cursor) {
            if (cursor == null) {
                return null;
            }
            String string = cursor.getString(cursor.getColumnIndex(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_FIRST_NAME_SORT_FORMAT));
            String string2 = cursor.getString(cursor.getColumnIndex(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_LAST_NAME_SORT_FORMAT));
            String string3 = cursor.getString(cursor.getColumnIndex("lastName"));
            return Character.valueOf(!TextUtils.isEmpty(string2) ? string2.charAt(0) : !TextUtils.isEmpty(string) ? string.charAt(0) : !TextUtils.isEmpty(string3) ? string3.charAt(0) : getFullName(cursor).charAt(0));
        }

        private String getFullName(Cursor cursor) {
            if (cursor == null) {
                return null;
            }
            String string = cursor.getString(cursor.getColumnIndex("firstName"));
            String string2 = cursor.getString(cursor.getColumnIndex("lastName"));
            String string3 = cursor.getString(cursor.getColumnIndex(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_NICK_NAME));
            if (TextUtils.isEmpty(string3)) {
                string3 = cursor.getString(cursor.getColumnIndex(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_SOURCE_NICK_NAME));
            }
            return ContactUtils.getFullName(new FullContactName(string, string2, string3, cursor.getString(cursor.getColumnIndex("company"))));
        }

        private boolean isInValidCharacterRange(Character ch) {
            boolean z = (ch.charValue() >= ContactListAdapter.this.mContext.getString(R.string.contact_list_section_start_alphabet_small).charAt(0) && ch.charValue() <= ContactListAdapter.this.mContext.getString(R.string.contact_list_section_end_alphabet_small).charAt(0)) || (ch.charValue() >= ContactListAdapter.this.mContext.getString(R.string.contact_list_section_start_alphabet_large).charAt(0) && ch.charValue() <= ContactListAdapter.this.mContext.getString(R.string.contact_list_section_end_alphabet_large).charAt(0));
            return ContactListAdapter.this.mUserPFM.equals("JP") ? LanguageUtil.isHiragana(ch.charValue()) | z : z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r7 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
        
            if (r8 != null) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void render(android.database.Cursor r12) {
            /*
                Method dump skipped, instructions count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.contacts.ui.ContactListAdapter.ContactViewHolder.render(android.database.Cursor):void");
        }
    }

    public ContactListAdapter(Context context, boolean z, boolean z2) {
        super(context, (Cursor) null, 0);
        this.mContext = context;
        this.mIsThemedUI = z2;
        this.mUserPFM = CommsDaggerWrapper.getComponent().getCommsIdentityManager().getPreferredMarketplace(false);
        CommsDaggerWrapper.getComponent().inject(this);
        this.shouldShowCheckbox = z;
        if (CoboUtils.isCoboCallingAvailable()) {
            this.mNonAlexaContactColorId = R.color.contact_list_name;
        } else {
            this.mNonAlexaContactColorId = R.color.non_cobo_non_alexa_contact_list_name;
        }
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((ContactViewHolder) view.getTag()).render(cursor);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.mContext.getSystemService("layout_inflater");
        LOG.d("[ContactListAdapter] mosaic themening is enabled: " + this.themingUpdateUtil.isMosaicThemingEnabled());
        if (this.mIsThemedUI && this.themingUpdateUtil.isMosaicThemingEnabled()) {
            ThemeUtil.setTheme(context);
        }
        View inflate = this.mIsThemedUI ? layoutInflater.inflate(R.layout.fiesta_contact_list_item, (ViewGroup) null) : layoutInflater.inflate(R.layout.contact_list_item, (ViewGroup) null);
        if (this.mIsThemedUI && this.themingUpdateUtil.isMosaicThemingEnabled()) {
            this.themingUpdateUtil.applyBackgroundColorToView(inflate, this.mContext, R.attr.mosaicBackground);
        }
        ContactViewHolder contactViewHolder = new ContactViewHolder(inflate);
        contactViewHolder.render(cursor);
        inflate.setTag(contactViewHolder);
        return inflate;
    }

    @Override // android.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        this.mListItemStates = cursor == null ? null : new int[cursor.getCount()];
        this.mListItemDividerVisibilityStates = cursor != null ? new int[cursor.getCount()] : null;
        return super.swapCursor(cursor);
    }
}
