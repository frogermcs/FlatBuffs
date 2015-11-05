//
// Created by Miroslaw Stanek on 26.10.2015.
//

#include <jni.h>
#include "flatbuffers/flatbuffers.h"

extern "C" {

JNIEXPORT jbyteArray JNICALL
        Java_frogermcs_io_flatbuffersparser_FlatBuffersParser_parseJsonNative(JNIEnv *env,
                                                                              jobject instance,
                                                                              jstring json_,
                                                                              jstring schema_);
}