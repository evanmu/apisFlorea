package com.openIdeas.apps.apisflorea.intf;

import java.io.InputStream;

import com.openIdeas.apps.apisflorea.result.FileResult;

public interface ImportFileServiceIntf {

    FileResult importCsv(InputStream in);
}
