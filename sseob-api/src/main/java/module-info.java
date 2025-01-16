module com.api {
  requires com.domain; // compile-time, runtime dependency
//  requires static com.domain; // compile-time dependency
//  requires transitive com.domain; // gradle java-library plugin api() 와 같은 역할
}

