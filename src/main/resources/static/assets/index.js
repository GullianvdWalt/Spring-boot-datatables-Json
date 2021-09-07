$(document).ready(function() {
    initProductTable();
});

function initProductTable(){
    let productTable = $('#productTable').DataTable( {
        processing: true,
        serverSide: true,
        language: {
            sInfoEmpty: "0 Products",
            emptyTable: "No products added yet",
            searchPlaceholder: "Search Products"
        },
        lengthMenu: [[1, 2, 5, -1], [1, 2, 5, 'All']],
        sAjaxSource: "/products",
        sAjaxDataProp: "",
        order: [[ 0, "asc" ]],
        aoColumns: [
            { mData: 'id' },
            { mData: 'name' },
            { mData: 'description' },
            { mData: 'brand' },
            { mData: 'price' },
            { mData: 'units' },
        ],
    });
}