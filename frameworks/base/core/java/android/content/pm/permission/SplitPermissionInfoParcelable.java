/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content.pm.permission;

import android.annotation.IntRange;
import android.annotation.NonNull;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.internal.util.Preconditions;

import java.util.List;
import java.util.Objects;

/**
 * Parcelable version of {@link android.permission.PermissionManager.SplitPermissionInfo}
 * @hide
 */
public class SplitPermissionInfoParcelable implements Parcelable {

    /**
     * The permission that is split.
     */
    @NonNull
    private final String mSplitPermission;

    /**
     * The permissions that are added.
     */
    @NonNull
    private final List<String> mNewPermissions;

    /**
     * The target API level when the permission was split.
     */
    @IntRange(from = 0)
    private final int mTargetSdk;

    private void onConstructed() {
        Preconditions.checkCollectionElementsNotNull(mNewPermissions, "newPermissions");
    }



    // Code below generated by codegen v1.0.0.
    //
    // DO NOT MODIFY!
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/content/pm/SplitPermissionInfoParcelable.java
    //
    // CHECKSTYLE:OFF Generated code

    /**
     * Creates a new SplitPermissionInfoParcelable.
     *
     * @param splitPermission
     *   The permission that is split.
     * @param newPermissions
     *   The permissions that are added.
     * @param targetSdk
     *   The target API level when the permission was split.
     */
    public SplitPermissionInfoParcelable(
            @NonNull String splitPermission,
            @NonNull List<String> newPermissions,
            @IntRange(from = 0) int targetSdk) {
        this.mSplitPermission = splitPermission;
        Preconditions.checkNotNull(mSplitPermission);
        this.mNewPermissions = newPermissions;
        Preconditions.checkNotNull(mNewPermissions);
        this.mTargetSdk = targetSdk;
        Preconditions.checkArgumentNonnegative(mTargetSdk);

        onConstructed();
    }

    /**
     * The permission that is split.
     */
    public @NonNull String getSplitPermission() {
        return mSplitPermission;
    }

    /**
     * The permissions that are added.
     */
    public @NonNull List<String> getNewPermissions() {
        return mNewPermissions;
    }

    /**
     * The target API level when the permission was split.
     */
    public @IntRange(from = 0) int getTargetSdk() {
        return mTargetSdk;
    }

    @Override
    public boolean equals(Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(SplitPermissionInfoParcelable other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        SplitPermissionInfoParcelable that = (SplitPermissionInfoParcelable) o;
        //noinspection PointlessBooleanExpression
        return true
                && Objects.equals(mSplitPermission, that.mSplitPermission)
                && Objects.equals(mNewPermissions, that.mNewPermissions)
                && mTargetSdk == that.mTargetSdk;
    }

    @Override
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + Objects.hashCode(mSplitPermission);
        _hash = 31 * _hash + Objects.hashCode(mNewPermissions);
        _hash = 31 * _hash + mTargetSdk;
        return _hash;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeString(mSplitPermission);
        dest.writeStringList(mNewPermissions);
        dest.writeInt(mTargetSdk);
    }

    @Override
    public int describeContents() { return 0; }

    public static final @NonNull Parcelable.Creator<SplitPermissionInfoParcelable> CREATOR
            = new Parcelable.Creator<SplitPermissionInfoParcelable>() {
        @Override
        public SplitPermissionInfoParcelable[] newArray(int size) {
            return new SplitPermissionInfoParcelable[size];
        }

        @Override
        @SuppressWarnings({"unchecked", "RedundantCast"})
        public SplitPermissionInfoParcelable createFromParcel(Parcel in) {
            // You can override field unparcelling by defining methods like:
            // static FieldType unparcelFieldName(Parcel in) { ... }

            String splitPermission = in.readString();
            List<String> newPermissions = new java.util.ArrayList<>();
            in.readStringList(newPermissions);
            int targetSdk = in.readInt();
            return new SplitPermissionInfoParcelable(
                    splitPermission,
                    newPermissions,
                    targetSdk);
        }
    };
}
