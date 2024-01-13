require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

RENESAS_BSP_URL = " \
    git://github.com/hungcuiga1/linux-bsp.git"
BRANCH = "main"
SRCREV = "8404dd44e4d42703ee8d85bc7fb35997af8081e0"

SRC_URI = "${RENESAS_BSP_URL};branch=${BRANCH};protocol=https"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

S = "${WORKDIR}/git"
