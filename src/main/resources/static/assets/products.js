$(document).ready(function() {
    initProductTable();
});

function initProductTable(){
    let productTable = $('#productTable').DataTable( {
        processing: true,
        stateSave:true,
        serverSide: true,
        // ajax:{
        //   url: "/products",
        //   type: "POST",
        //   dataType: "json",
        //   contentType: "application/json",
        //   data: d => ( JSON.stringify(d))
        // },
        stateSaveCallback: function (settings, data) {
            console.log(data)
            // Send an Ajax request to the server with the state object
            // $.ajax({
            //     "url": "/state_save",
            //     "data": data,
            //     "dataType": "json",
            //     "type": "POST",
            //     "success": function () {
            //     }
            // });
        },
        language: {
        sInfoEmpty: "0 Products",
        emptyTable: "No products added yet",
        searchPlaceholder: "Search Products"
        },
        lengthMenu: [[1, 2, 5, -1], [1, 2, 5, 'All']],
        sAjaxSource: "/products/get-products",
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