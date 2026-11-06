package com.amazon.alexa.voice.settings;

import com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LocaleGroup;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LocaleCombinationComparator implements Comparator<LocaleGroup> {
    private final Collator collator = Collator.getInstance(Locale.US);
    private final List<Comparator<LocaleGroup>> comparators;

    public LocaleCombinationComparator() {
        int i = 0;
        this.comparators = Arrays.asList(new LocaleLanguageComparator(this, i), new LocaleCountryComparator(this, i));
    }

    @Override // java.util.Comparator
    public int compare(LocaleGroup localeGroup, LocaleGroup localeGroup2) {
        Iterator<Comparator<LocaleGroup>> it2 = this.comparators.iterator();
        while (it2.hasNext()) {
            int compare = it2.next().compare(localeGroup, localeGroup2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleCountryComparator implements Comparator<LocaleGroup> {
        private LocaleCountryComparator() {
        }

        @Override // java.util.Comparator
        public int compare(LocaleGroup localeGroup, LocaleGroup localeGroup2) {
            List<Locale> locales = localeGroup.getLocales();
            List<Locale> locales2 = localeGroup2.getLocales();
            int compare = LocaleCombinationComparator.this.collator.compare(locales.get(0).getDisplayCountry(locales.get(0)), locales2.get(0).getDisplayCountry(locales2.get(0)));
            return compare == 0 ? (locales.size() <= 1 || locales2.size() <= 1) ? locales.size() == 1 ? -1 : 1 : LocaleCombinationComparator.this.collator.compare(locales.get(1).getDisplayCountry(locales.get(1)), locales2.get(1).getDisplayCountry(locales2.get(1))) : compare;
        }

        public /* synthetic */ LocaleCountryComparator(LocaleCombinationComparator localeCombinationComparator, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleLanguageComparator implements Comparator<LocaleGroup> {
        private LocaleLanguageComparator() {
        }

        @Override // java.util.Comparator
        public int compare(LocaleGroup localeGroup, LocaleGroup localeGroup2) {
            List<Locale> locales = localeGroup.getLocales();
            List<Locale> locales2 = localeGroup2.getLocales();
            int compare = LocaleCombinationComparator.this.collator.compare(locales.get(0).getDisplayLanguage(locales.get(0)), locales2.get(0).getDisplayLanguage(locales2.get(0)));
            return compare == 0 ? (locales.size() <= 1 || locales2.size() <= 1) ? locales.size() == 1 ? -1 : 1 : LocaleCombinationComparator.this.collator.compare(locales.get(1).getDisplayLanguage(locales.get(1)), locales2.get(1).getDisplayLanguage(locales2.get(1))) : compare;
        }

        public /* synthetic */ LocaleLanguageComparator(LocaleCombinationComparator localeCombinationComparator, int i) {
            this();
        }
    }
}
