require update-alternatives-dpkg.inc
inherit native

PROVIDES += "virtual/update-alternatives-native"
DEPENDS = "perl-native"
DEFAULT_PREFERENCE = "-1"

do_stage () {
    install -d ${sbindir} \
               ${localstatedir}/dpkg/alternatives \
               ${sysconfdir}/alternatives

    install -m 0755 scripts/update-alternatives ${sbindir}/update-alternatives
}

SRC_URI[md5sum] = "0fc9fffc2c2cfa7107d8f422815078c1"
SRC_URI[sha256sum] = "c33aeb300d93eaeac55927ce81dc6f3a1cf74b3b759b65182c9bfca31b75b98f"