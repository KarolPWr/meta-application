
SUMMARY = "ncurses snake game"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/alexdantas/nSnake.git;branch=master"

PV = "1.0+git"
SRCREV = "d018237c22beabb99ec727e73c3e04e580edcebf"

S = "${WORKDIR}/git"

DEPENDS += " ncurses"
TARGET_CC_ARCH += "${LDFLAGS}"

# do_configure () {
# 	:
# }

# do_compile () {
# 	oe_runmake
# }

do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${B}/bin/nsnake ${D}${bindir}/nsnake
}

FILES_${PN} += "${bindir}/nsnake"

