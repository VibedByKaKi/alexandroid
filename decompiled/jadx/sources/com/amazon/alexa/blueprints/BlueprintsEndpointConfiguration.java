package com.amazon.alexa.blueprints;

import com.amazon.alexa.marketplace.api.Marketplace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum BlueprintsEndpointConfiguration {
    CANADA(Marketplace.CANADA, BlueprintsEndpointConstants.BETA_CANADA_ENDPOINT, BlueprintsEndpointConstants.GAMMA_CANADA_ENDPOINT, BlueprintsEndpointConstants.PROD_CANADA_ENDPOINT),
    USA(Marketplace.USA, BlueprintsEndpointConstants.BETA_USA_ENDPOINT, BlueprintsEndpointConstants.GAMMA_USA_ENDPOINT, BlueprintsEndpointConstants.PROD_USA_ENDPOINT),
    MEXICO(Marketplace.MEXICO_PRODUCTION, BlueprintsEndpointConstants.BETA_MEXICO_ENDPOINT, BlueprintsEndpointConstants.GAMMA_MEXICO_ENDPOINT, BlueprintsEndpointConstants.PROD_MEXICO_ENDPOINT),
    GERMANY(Marketplace.GERMANY, BlueprintsEndpointConstants.BETA_GERMANY_ENDPOINT, BlueprintsEndpointConstants.GAMMA_GERMANY_ENDPOINT, BlueprintsEndpointConstants.PROD_GERMANY_ENDPOINT),
    SPAIN(Marketplace.SPAIN, BlueprintsEndpointConstants.BETA_SPAIN_ENDPOINT, BlueprintsEndpointConstants.GAMMA_SPAIN_ENDPOINT, BlueprintsEndpointConstants.PROD_SPAIN_ENDPOINT),
    FRANCE(Marketplace.FRANCE, BlueprintsEndpointConstants.BETA_FRANCE_ENDPOINT, BlueprintsEndpointConstants.GAMMA_FRANCE_ENDPOINT, BlueprintsEndpointConstants.PROD_FRANCE_ENDPOINT),
    UNITED_KINGDOM(Marketplace.UNITED_KINGDOM, BlueprintsEndpointConstants.BETA_UK_ENDPOINT, BlueprintsEndpointConstants.GAMMA_UK_ENDPOINT, BlueprintsEndpointConstants.PROD_UK_ENDPOINT),
    INDIA(Marketplace.INDIA, BlueprintsEndpointConstants.BETA_INDIA_ENDPOINT, BlueprintsEndpointConstants.GAMMA_INDIA_ENDPOINT, BlueprintsEndpointConstants.PROD_INDIA_ENDPOINT),
    ITALY(Marketplace.ITALY_PRODUCTION, BlueprintsEndpointConstants.BETA_ITALY_ENDPOINT, BlueprintsEndpointConstants.GAMMA_ITALY_ENDPOINT, BlueprintsEndpointConstants.PROD_ITALY_ENDPOINT),
    AUSTRALIA(Marketplace.AUSTRALIA_PRODUCTION, BlueprintsEndpointConstants.BETA_AUSTRALIA_ENDPOINT, BlueprintsEndpointConstants.GAMMA_AUSTRALIA_ENDPOINT, BlueprintsEndpointConstants.PROD_AUSTRALIA_ENDPOINT),
    JAPAN(Marketplace.JAPAN, BlueprintsEndpointConstants.BETA_JAPAN_ENDPOINT, BlueprintsEndpointConstants.GAMMA_JAPAN_ENDPOINT, BlueprintsEndpointConstants.PROD_JAPAN_ENDPOINT);

    public final String betaEndpoint;
    public final String gammaEndpoint;
    public final Marketplace marketplace;
    public final String prodEndpoint;

    BlueprintsEndpointConfiguration(Marketplace marketplace, String str, String str2, String str3) {
        this.marketplace = marketplace;
        this.betaEndpoint = str;
        this.gammaEndpoint = str2;
        this.prodEndpoint = str3;
    }

    private static String getEndpointForMarketplacebyStage(String str, BlueprintsEndpointConfiguration blueprintsEndpointConfiguration) {
        str.getClass();
        switch (str) {
            case "preprod":
            case "gamma":
                return blueprintsEndpointConfiguration.gammaEndpoint;
            case "beta":
            case "alpha":
            case "local":
                return blueprintsEndpointConfiguration.betaEndpoint;
            default:
                return blueprintsEndpointConfiguration.prodEndpoint;
        }
    }

    public static String getEndpointbyStageandMarketplace(String str, Marketplace marketplace) {
        if (str == null) {
            str = "prod";
        }
        if (marketplace == null) {
            marketplace = Marketplace.USA;
        }
        for (BlueprintsEndpointConfiguration blueprintsEndpointConfiguration : values()) {
            if (blueprintsEndpointConfiguration.marketplace.equals(marketplace)) {
                return getEndpointForMarketplacebyStage(str, blueprintsEndpointConfiguration);
            }
        }
        return getEndpointForMarketplacebyStage(str, USA);
    }
}
