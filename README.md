![Quarkus CI Native](https://github.com/serrodcal/quarkus-locust/workflows/Quarkus%20CI%20Native/badge.svg)

# quarkus-locust

This project is based in [quarkus-prometheus-grafana's repository](https://github.com/serrodcal/quarkus-prometheus-grafana) and the idea is to look into locust.

```sh
$ kubectl apply -f k8s
```

```sh
$ kubectl port-forward -n locust locust-<pod> 8089
```

```sh
$ kubectl port-forward -n monitoring grafana-<pod> 3000
```

Open in a tab browser:

1. [http://localhost:3000](http://localhost:3000) (`admin:admin`)
2. [http://localhost:8089](http://localhost:8089) (`100:10:http://app.default.svc.cluster.local:8080`)

Adding more load:

```sh
$ kubectl run -i --tty load-generator --rm --image=busybox --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://app:8080/hello; done"
```
