package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Setting {
    private List<Capability> capabilities;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SettingBuilder {
        private List<Capability> capabilities;

        public Setting build() {
            return new Setting(this.capabilities, 0);
        }

        public SettingBuilder capabilities(List<Capability> list) {
            this.capabilities = list;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Setting.SettingBuilder(capabilities=", String.valueOf(this.capabilities), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private Setting(List<Capability> list) {
        this.capabilities = list;
    }

    public static SettingBuilder builder() {
        return new SettingBuilder();
    }

    public List<Capability> getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(List<Capability> list) {
        this.capabilities = list;
    }

    public Setting() {
    }

    public /* synthetic */ Setting(List list, int i) {
        this(list);
    }
}
