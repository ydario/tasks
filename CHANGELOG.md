### 13.1.2 (2023-02-02)

* Add default reminders to incoming iCalendar tasks [#1984](https://github.com/tasks/tasks/issues/1984)
* Sync when brought to the foreground [#2096](https://github.com/tasks/tasks/issues/2096)
* Update translations
  * Arabic - haidarah esmander
  * Czech - @SlavekB
  * Danish - Tntdruid
  * Esperanto - Don Zouras, @J053Fabi0
  * Finnish - @millerii
  * German - @franconian
  * Italian - @ppasserini
  * Japanese - Kazushi Hayama
  * Korean - @o20n3
  * Polish - @gnu-ewm
  * Vietnamese - @unbiaseduser

### 13.1.1 (2022-12-06)

* Fix crash when opening notification settings
* Fix IAP errors in some locales
* Update translations
  * Italian - @ppasserini
  * Japanese - Kazushi Hayama

### 13.1.0 (2022-11-30)

* Support for DAVx5 and CalDAV read-only lists [#931](https://github.com/tasks/tasks/issues/931)
* Use default Android network security configuration
* Update translations
  * Bulgarian - @StoyanDimitrov
  * Chinese (Simplified) - Eric
  * Croatian - @milotype
  * Dutch - @fvbommel
  * Finnish - @millerii
  * French - @FlorianLeChat
  * German - @helloworldtest123
  * Hungarian - Kaci
  * Italian - @ppasserini
  * Lithuanian - @70h
  * Russian - Nikita Epifanov
  * Spanish - @FlorianLeChat
  * Turkish - @ersen0
  * Ukrainian - @IhorHordiichuk

### 13.0.2 (2022-11-22)

* Fix persistent notifications on Android 13
* Fix Samsung crash on too many reminders (DAVx5, EteSync, DecSync CC)
* Fix crash on too many tasks for Astrid Manual Sorting
* Fix RTL text in task edit customization screen
* Fix priority button order

### 13.0.1 (2022-10-20)

* 🚨 Major internal changes to task edit screen. Please report any bugs! 🚨
* Show thumbnails for attachments
* Tap on existing alarms to replace them
* Add task info row to edit screen [#1839](https://github.com/tasks/tasks/pull/1839)
* Add option to disable reminders for all-day tasks [#2003](https://github.com/tasks/tasks/pull/2003)
* Updated chip style
* Show geofence circle in place settings
* Fix removing preferences [#1981](https://github.com/tasks/tasks/pull/1981)
* Set user-agent on HTTP requests [#1978](https://github.com/tasks/tasks/issues/1978)
* Preserve HTTP session cookies [#1978](https://github.com/tasks/tasks/issues/1978)
* Sort selected tags at top of tag picker
* Android 13 support
  * Runtime notification permissions
  * Language preference
* Improvements to copying tasks
  * Don't forget parent when copying tasks [#1964](https://github.com/tasks/tasks/pull/1964)
  * Copy attachments when duplicating tasks [#812](https://github.com/tasks/tasks/issues/812)
  * Fix duplicating subtasks
* Fix some missing reminders
  * Incoming Google Tasks
  * Tasker tasks [#1937](https://github.com/tasks/tasks/issues/1937)
  * New subtasks [#1914](https://github.com/tasks/tasks/issues/1914)
* Fix Google Task creation time
* Fix EteSync stops synchronizing [#1893](https://github.com/tasks/tasks/issues/1893)
* Don't overwrite coordinates when synchronizing locations [#1667](https://github.com/tasks/tasks/issues/1667)
* Update translations
  * Asturian - @enolp
  * Basque - Sergio Varela
  * Bulgarian - @StoyanDimitrov
  * Chinese (Simplified) - Eric
  * Croatian - @milotype
  * Czech - Shimon
  * Dutch - @fvbommel
  * French - @FlorianLeChat, J. Lavoie
  * German - @qwerty287
  * Italian - @ppasserini
  * Norwegian Bokmål - @comradekingu
  * Persian - @latelateprogrammer
  * Polish - @ebogucka
  * Portuguese - @laralem
  * Romanian - @simonaiacob
  * Russian - @Allineer, Nikita Epifanov
  * Sinhala - @Dilshan-H
  * Spanish - @FlorianLeChat
  * Turkish - @ersen0
  * Ukrainian - @IhorHordiichuk, @artemmolotov
  * Vietnamese - @unbiaseduser

[Older releases](https://github.com/tasks/tasks/blob/main/V10_12_CHANGELOG.md)
