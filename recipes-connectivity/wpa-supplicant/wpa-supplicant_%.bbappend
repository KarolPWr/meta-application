FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://wpa_supplicant-nl80211-wlan0.conf"
SRC_URI += "file://25-wireless.network"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN}:append = " wpa_supplicant-nl80211@wlan0.service  "

do_install:append () {
   install -d ${D}${sysconfdir}/wpa_supplicant/
   install -D -m 600 ${WORKDIR}/wpa_supplicant-nl80211-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/

   install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
   ln -s ${systemd_unitdir}/system/wpa_supplicant@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant-nl80211@wlan0.service

   install -d ${D}${systemd_unitdir}/network
   install -m 0755 ${WORKDIR}/25-wireless.network ${D}${systemd_unitdir}/network/

}

FILES:${PN} += " \
    ${systemd_unitdir}/network/25-wireless.network \
    ${systemd_unitdir}/network \
"
