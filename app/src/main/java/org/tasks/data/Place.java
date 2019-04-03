package org.tasks.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.google.common.base.Strings;
import com.todoroo.astrid.helper.UUIDHelper;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.tasks.location.MapPosition;

@Entity(tableName = "places")
public class Place implements Serializable, Parcelable {

  public static final Creator<Place> CREATOR =
      new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel source) {
          return new Place(source);
        }

        @Override
        public Place[] newArray(int size) {
          return new Place[size];
        }
      };

  private static final Pattern COORDS =
      Pattern.compile("^\\d+°\\d+'\\d+\\.\\d+\"[NS] \\d+°\\d+'\\d+\\.\\d+\"[EW]$");

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "place_id")
  private transient long id;

  @ColumnInfo(name = "uid")
  private String uid;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "address")
  private String address;

  @ColumnInfo(name = "phone")
  private String phone;

  @ColumnInfo(name = "url")
  private String url;

  @ColumnInfo(name = "latitude")
  private double latitude;

  @ColumnInfo(name = "longitude")
  private double longitude;

  public Place() {}

  @Ignore
  public Place(Place o) {
    id = o.id;
    uid = o.uid;
    name = o.name;
    address = o.address;
    phone = o.phone;
    url = o.url;
    latitude = o.latitude;
    longitude = o.longitude;
  }

  @Ignore
  public Place(Parcel parcel) {
    id = parcel.readLong();
    uid = parcel.readString();
    name = parcel.readString();
    address = parcel.readString();
    phone = parcel.readString();
    url = parcel.readString();
    latitude = parcel.readDouble();
    longitude = parcel.readDouble();
  }

  public static Place newPlace() {
    Place place = new Place();
    place.setUid(UUIDHelper.newUUID());
    return place;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDisplayName() {
    if (Strings.isNullOrEmpty(address)) {
      return name;
    }
    if (COORDS.matcher(name).matches()) {
      return address;
    }
    if (address.startsWith(name)) {
      return address;
    }
    return name;
  }

  String getGeoUri() {
    return String.format(
        "geo:%s,%s?q=%s",
        latitude, longitude, Uri.encode(Strings.isNullOrEmpty(address) ? name : address));
  }

  public MapPosition getMapPosition() {
    return new MapPosition(latitude, longitude);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Place place = (Place) o;

    if (id != place.id) {
      return false;
    }
    if (Double.compare(place.latitude, latitude) != 0) {
      return false;
    }
    if (Double.compare(place.longitude, longitude) != 0) {
      return false;
    }
    if (uid != null ? !uid.equals(place.uid) : place.uid != null) {
      return false;
    }
    if (name != null ? !name.equals(place.name) : place.name != null) {
      return false;
    }
    if (address != null ? !address.equals(place.address) : place.address != null) {
      return false;
    }
    if (phone != null ? !phone.equals(place.phone) : place.phone != null) {
      return false;
    }
    return url != null ? url.equals(place.url) : place.url == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = (int) (id ^ (id >>> 32));
    result = 31 * result + (uid != null ? uid.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (url != null ? url.hashCode() : 0);
    temp = Double.doubleToLongBits(latitude);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(longitude);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Place{"
        + "id="
        + id
        + ", uid='"
        + uid
        + '\''
        + ", name='"
        + name
        + '\''
        + ", address='"
        + address
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", url='"
        + url
        + '\''
        + ", latitude="
        + latitude
        + ", longitude="
        + longitude
        + '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel out, int flags) {
    out.writeLong(id);
    out.writeString(uid);
    out.writeString(name);
    out.writeString(address);
    out.writeString(phone);
    out.writeString(url);
    out.writeDouble(latitude);
    out.writeDouble(longitude);
  }
}
