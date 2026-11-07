# Alexandroid

A small native Android client for Alexa, written in Kotlin with no AndroidX or Compose dependency.

It covers four things:

- Smart home devices: read the current state, toggle on, toggle off.
- Launcher widgets for the same: a scrollable list of every device, and a single-device toggle.
- Alarms and timers: list, enable or disable, pause or resume, delete, create.
- Voice history, and a light, dark or system theme.

Voice control, chats, lists, notes, reminders, routines, skills and the calendar are out of scope.

## Build

```bash
./gradlew :app:assembleDebug
```

CI (`.github/workflows/build-apk.yml`) builds a release APK and signs it with the keystore stored in the
`ALEXA_KEYSTORE_BASE64`, `ALEXA_KEYSTORE_PASSWORD`, `ALEXA_KEY_PASSWORD` and `ALEXA_KEY_ALIAS` repository secrets.
The APK is attached to a `build-<sha>` pre-release (and to the `alexandroid-apk` artifact when storage quota allows).

## Sign-in

The app opens the regular Amazon sign-in page in a WebView (so two-step verification works), registers itself as
a device with OAuth2 code and PKCE, and stores the refresh token. It exchanges that token for web cookies and renews
them when Amazon rejects a request. Pick your Amazon region in Settings before signing in. Accounts are per marketplace: the same email can have different devices on amazon.com and amazon.fr, and the sign-in page uses a per-region `amzn_dp_project_dee_android_<region>` handle.

## Endpoints used

These were taken from the Hermes bundle and Java sources of Alexa 2.2.730155.0 (see `decompiled/`) and checked
against a live account.

| Feature | Request |
|---|---|
| Device list and state | `POST https://alexa.amazon.<tld>/nexus/v1/graphql`, query `listEndpoints` with `features { ... on Power { powerStateValue } }` |
| Toggle | same endpoint, mutation `setEndpointFeatures` with `featureName: power` and `featureOperationName: turnOn` or `turnOff` |
| Alarms | `GET`, `PUT` and `DELETE https://alexa.amazon.<tld>/api/notifications[/{id}]`; creation is `PUT /api/notifications/createReminder` with `status: ON` |
| Alarm repeat and date | `recurringPattern`: `P1D` daily, `XXXX-WD` weekdays, `XXXX-WE` weekends, `XXXX-WXX-1` to `XXXX-WXX-7` for single days (comma-separated for several), `""` for once, and `YYYY-MM-DD` for a one-time alarm on that date. Setting `originalDate` alone is ignored by the server |
| Timers | listed, paused (`PUT` with `status: PAUSED`), resumed and deleted through `/api/notifications`. Creating one through that endpoint returns HTTP 500, so the app sends the text command "set a timer for N minutes" (in the device's language) to `POST /api/behaviors/preview` |
| Echo devices | `GET /api/devices-v2/device?cached=false` |
| Voice history | `GET https://www.amazon.<tld>/alexa-privacy/apd/rvh/customer-history-records?startTime=&endTime=` (10 records per call; the page token is rejected, so the app moves `endTime` back to the oldest record and deduplicates) |

The older `/api/phoenix` and `/api/activities` endpoints no longer answer, which is why the app does not use them.

## Decompiled app

`decompiled/` holds the output of jadx (Java sources) and apktool (manifest and resources) for the Alexa app
2.2.730155.0 for Android, plus the string table of its React Native Hermes bundle
(`index.bundle.strings.txt.gz`). The APK itself is not committed.
