

import java.util.Arrays;

class InsuredObject {
    private String objectName;
    private SubObject[] subobject;

    public InsuredObject(String objectName, SubObject ...subobject) {
        this.objectName = objectName;
        this.subobject = subobject;
    }

    public String getObjectName() {
        return objectName;
    }

    public SubObject[] getSubobject() {
        return subobject;
    }

    @Override
    public String toString() {
        return "objectName= " + objectName + '\'' +
                ", subobject= " + Arrays.toString(subobject);
    }
}
