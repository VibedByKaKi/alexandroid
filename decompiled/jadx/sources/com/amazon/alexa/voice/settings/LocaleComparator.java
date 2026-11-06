package com.amazon.alexa.voice.settings;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LocaleComparator implements Comparator<Locale> {
    private final Collator collator = Collator.getInstance(Locale.US);
    private final List<Comparator<Locale>> comparators;

    public LocaleComparator() {
        int i = 0;
        this.comparators = Arrays.asList(new LocaleLanguageComparator(this, i), new LocaleCountryComparator(this, i));
    }

    @Override // java.util.Comparator
    public int compare(Locale locale, Locale locale2) {
        Iterator<Comparator<Locale>> it2 = this.comparators.iterator();
        while (it2.hasNext()) {
            int compare = it2.next().compare(locale, locale2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleCountryComparator implements Comparator<Locale> {
        private LocaleCountryComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Locale locale, Locale locale2) {
            return LocaleComparator.this.collator.compare(locale.getDisplayCountry(locale), locale2.getDisplayCountry(locale2));
        }

        public /* synthetic */ LocaleCountryComparator(LocaleComparator localeComparator, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleLanguageComparator implements Comparator<Locale> {
        private LocaleLanguageComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Locale locale, Locale locale2) {
            return LocaleComparator.this.collator.compare(locale.getDisplayLanguage(locale), locale2.getDisplayLanguage(locale2));
        }

        public /* synthetic */ LocaleLanguageComparator(LocaleComparator localeComparator, int i) {
            this();
        }
    }
}
