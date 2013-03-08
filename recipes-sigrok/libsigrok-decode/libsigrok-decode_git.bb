DESCRIPTION = "libsigrokdecode is a shared library written in C, which provides (streaming) protocol decoding functionality."

HOMEPAGE = "http://sigrok.org/wiki/Main_Page"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 python"

inherit autotools

PV = "0.1.1"

SRC_URI = "git://sigrok.org/libsigrokdecode"
SRCREV = "4895418c6800ecb128ed36af2a1bc46916c9be85"

S= "${WORKDIR}/git"

do_configure() {
	sh autogen.sh
	oe_runconf
}
