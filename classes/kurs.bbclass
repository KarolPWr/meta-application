
python do_generate_info (){
    pn = d.getVar('PN')
    pv = d.getVar('PV')
    bpn = d.getVar('BPN')
    buildhost = d.getVar('BUILDHOST')
    target_arch = d.getVar('TARGET_ARCH')
    s_dir = d.getVar('S')
    workdir = d.getVar('WORKDIR')

    bb.warn(f"Hello {pn} {workdir}")
}

addtask do_generate_info after do_compile before do_install