SUMMARY = "Console Games for Raspberry Pi"
DESCRIPTION = "Installs console-based games like nudoku and nsnake. These are specifically added for Raspberry Pi 4 targets."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup



# RDEPENDS for this package group.
# Initially, it can be empty or include common packages if any.
#RDEPENDS:${PN} = ""

# Conditionally add nudoku and nsnake if the machine is raspberrypi4
# Note: If you are building for a 64-bit Raspberry Pi 4, your MACHINE variable might be
# 'raspberrypi4-64'. Adjust or add an additional append line if necessary.
# e.g., RDEPENDS:${PN}:append:raspberrypi4-64 = " nudoku nsnake"

#RDEPENDS:${PN}:append:raspberrypi4 = " \
#    nudoku \
#    nsnake \
#"

# If you want to ensure these are also added for the 64-bit variant, you can do:
RDEPENDS:${PN}:append:raspberrypi4-64 = " \
    nudoku \
    nsnake \
"

# You could also use a more generic approach if you have multiple RPi4 variants
# that should get these games, by checking a common feature or variable.
# For example, if all your RPi4 machines set a TUNE_FEATURES that includes 'armv8a'
# and you only want it for those (this is just an illustrative example, be specific):
# RDEPENDS:${PN}:append = "${@bb.utils.contains('TUNE_FEATURES', 'armv8a', ' nudoku nsnake', '', d)}"
# However, the direct machine append is usually clearer for specific machine targets.

