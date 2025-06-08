SUMMARY = "Console Games for Raspberry Pi"
DESCRIPTION = "Installs console-based games like nudoku and nsnake. These are specifically added for Raspberry Pi 4 targets."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS:${PN}:append:raspberrypi4-64 = " \
    nudoku \
    nsnake \
"


