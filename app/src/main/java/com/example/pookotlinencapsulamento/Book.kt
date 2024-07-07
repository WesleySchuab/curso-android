package com.example.pookotlinencapsulamento

class Book(
    private var _title: String,
    private var _author: String,
    private var _publisher: String,
    private var _location: String,
    private var _page: Int
) {
    var title: String
        get() = _title
        set(value) {
            _title = value
        }

    var author: String
        get() = _author
        set(value) {
            _author = value
        }
}

