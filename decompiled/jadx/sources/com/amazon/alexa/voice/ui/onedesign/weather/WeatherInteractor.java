package com.amazon.alexa.voice.ui.onedesign.weather;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WeatherInteractor implements WeatherInteractorContract {
    private final boolean alwaysFullScreen;
    private final WeatherCard card;
    private final WeatherMediatorContract mediator;

    public WeatherInteractor(WeatherCard weatherCard, WeatherMediatorContract weatherMediatorContract, boolean z) {
        this.card = weatherCard;
        this.mediator = weatherMediatorContract;
        this.alwaysFullScreen = z;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherInteractorContract
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherInteractorContract
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherInteractorContract
    public WeatherCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherInteractorContract
    public boolean isAlwaysFullScreen() {
        return this.alwaysFullScreen;
    }
}
