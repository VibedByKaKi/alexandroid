package com.amazon.alexa.voice.ui.onedesign.calendar;

import com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCard;
import com.amazon.alexa.voice.ui.onedesign.calendar.CalendarContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CalendarInteractor implements CalendarContract.Interactor {
    private final CalendarCard card;
    private final CalendarContract.Mediator mediator;

    public CalendarInteractor(CalendarCard calendarCard, CalendarContract.Mediator mediator) {
        this.card = calendarCard;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarContract.Interactor
    public CalendarCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarContract.Interactor
    public void showEvent(CalendarCard.Event event) {
        this.mediator.openEvent(event);
    }
}
