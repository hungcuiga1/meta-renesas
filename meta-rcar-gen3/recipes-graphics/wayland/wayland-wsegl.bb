SUMMARY = "wayland-wsegl library"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/waylandws.h;beginline=1;endline=22;md5=ebf7ec97b867b0329acbb2c4190fd7a9"

SRC_URI = "git://github.com/renesas-rcar/wayland-wsegl.git;branch=rcar_gen3_maintenance;protocol=https"

SRCREV = "04893c0cf1104a800d65d0bd46bb9e98437389bf"

COMPATIBLE_MACHINE = "(r8a7795|r8a7796|r8a77965|r8a77990)"

DEPENDS = "libgbm wayland-kms libdrm wayland wayland-native wayland-protocols"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

PACKAGES = " \
    ${PN} \
    ${PN}-dbg \
"

FILES_${PN} = " \
    ${libdir}/libpvrWAYLAND_WSEGL.so.* \
    ${libdir}/*.so \
"
FILES_${PN}-dbg += "${libdir}/libpvrWAYLAND_WSEGL/.debug/*"
INSANE_SKIP_${PN} += "dev-so"

