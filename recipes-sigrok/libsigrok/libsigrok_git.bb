DESCRIPTION = "libsigrok is a shared library written in C, which provides the basic hardware access drivers for logic analyzers, as well as input/output file format support."
HOMEPAGE = "http://sigrok.org/wiki/Main_Page"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 libusb1 libzip libftdi udev alsa-lib"

inherit autotools

PV = "0.1.1"

SRC_URI = "git://sigrok.org/libsigrok"
SRCREV = "2474d87e8c9b1133017a06c9ef0896626267e95b"

S= "${WORKDIR}/git"

do_configure() {
	sh autogen.sh
	oe_runconf
}
