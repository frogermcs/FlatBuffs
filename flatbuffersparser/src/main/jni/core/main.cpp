//
// Created by Miroslaw Stanek on 26.10.2015.
//

#ifndef __MAIN_H__
#define __MAIN_H__

#include <flatbuffers/idl.h>
#include "main.h"

JNIEXPORT jbyteArray JNICALL
Java_frogermcs_io_flatbuffersparser_FlatBuffersParser_parseJsonNative(JNIEnv *env,
                                                                      jobject instance,
                                                                      jstring json_,
                                                                      jstring schema_) {
    const char *json = env->GetStringUTFChars(json_, 0);
    const char *schema = env->GetStringUTFChars(schema_, 0);

    flatbuffers::Parser parser;
    bool ok = parser.Parse(schema) && parser.Parse(json);

    env->ReleaseStringUTFChars(json_, json);
    env->ReleaseStringUTFChars(schema_, schema);

    if (ok) {
        flatbuffers::uoffset_t length = parser.builder_.GetSize();
        jbyteArray result = env->NewByteArray(length);
        uint8_t *bufferPointer = parser.builder_.GetBufferPointer();
        env->SetByteArrayRegion(result, 0, length, reinterpret_cast<jbyte *>(bufferPointer));
        return result;
    }
}

#endif // __MAIN_H__